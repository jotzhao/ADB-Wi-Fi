package dev.polek.adbwifi.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.options.ShowSettingsUtil
import com.intellij.openapi.project.DumbAware
import dev.polek.adbwifi.MyBundle

class OpenSettingsAction : AnAction(), DumbAware {

    override fun actionPerformed(e: AnActionEvent) {
        ShowSettingsUtil.getInstance().showSettingsDialog(null, MyBundle.message("settingsPageName"))
    }
}
