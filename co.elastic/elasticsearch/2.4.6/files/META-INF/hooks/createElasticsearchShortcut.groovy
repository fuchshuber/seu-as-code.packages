import org.codehaus.groovy.scriptom.ActiveXObject
import org.codehaus.groovy.scriptom.Scriptom


Scriptom.inApartment {
    def wshShell = new ActiveXObject("WScript.Shell")
    def shortcut = wshShell.CreateShortcut("$seuHome\\Elasticsearch.lnk")
    shortcut.TargetPath = "${seuLayout.software}\\start-elasticsearch.bat"
    shortcut.WorkingDirectory = "${seuLayout.software}"
    shortcut.Save()
}
