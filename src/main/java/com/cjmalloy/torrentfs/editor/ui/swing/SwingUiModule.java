package com.cjmalloy.torrentfs.editor.ui.swing;

import com.cjmalloy.torrentfs.editor.ui.*;
import com.cjmalloy.torrentfs.editor.ui.swing.toplevel.Window;
import com.google.inject.AbstractModule;


public class SwingUiModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(TopLevel.class).to(Window.class);
    bind(UiUtils.class).to(SwingUiUtils.class).asEagerSingleton();
    bind(WorkerExecutor.class).to(SwingWorkerExecutor.class).asEagerSingleton();
  }
}
