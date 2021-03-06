package com.cjmalloy.torrentfs.editor.ui.fx;

import com.cjmalloy.torrentfs.editor.ui.*;
import com.cjmalloy.torrentfs.editor.ui.fx.toplevel.Window;
import com.google.inject.AbstractModule;


public class FxUiModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(TopLevel.class).to(Window.class);
    bind(UiUtils.class).to(FxUiUtils.class).asEagerSingleton();
    bind(WorkerExecutor.class).to(FxWorkerExecutor.class).asEagerSingleton();
  }
}
