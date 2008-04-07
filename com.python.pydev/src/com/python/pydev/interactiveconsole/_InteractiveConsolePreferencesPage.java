package com.python.pydev.interactiveconsole;
///*
// * Created on Mar 18, 2006
// */
//package com.python.pydev.interactiveconsole;
//
//import org.eclipse.jface.preference.BooleanFieldEditor;
//import org.eclipse.jface.preference.FieldEditorPreferencePage;
//import org.eclipse.jface.preference.StringFieldEditor;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.ui.IWorkbench;
//import org.eclipse.ui.IWorkbenchPreferencePage;
//import org.python.pydev.utils.LabelFieldEditorWith2Cols;
//import org.python.pydev.utils.MultiStringFieldEditor;
//
//import com.python.pydev.PydevPlugin;
//
//public class InteractiveConsolePreferencesPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage{
//
//    public static final String SHOW_CONSOLE_INPUT = "SHOW_CONSOLE_INPUT";
//    public static final boolean DEFAULT_SHOW_CONSOLE_INPUT = true;
//
//    public static final String EVAL_ON_NEW_LINE = "EVAL_ON_NEW_LINE";
//    public static final boolean DEFAULT_EVAL_ON_NEW_LINE = false;
//    
//    public static final String INTERACTIVE_CONSOLE_VM_ARGS = "INTERACTIVE_CONSOLE_VM_ARGS";
//    public static final String DEFAULT_INTERACTIVE_CONSOLE_VM_ARGS = "-Xmx64m";
//    
//    public static final String INITIAL_INTERPRETER_CMDS = "INITIAL_INTERPRETER_CMDS";
//    
//    public InteractiveConsolePreferencesPage() {
//        super(GRID);
//        //Set the preference store for the preference page.
//        setPreferenceStore(PydevPlugin.getDefault().getPreferenceStore());      
//        
//    }
//
//    @Override
//    public void createFieldEditors() {
//        Composite p = getFieldEditorParent();
//
//        addField(new LabelFieldEditorWith2Cols("Interactive_console_note","The console is automatically activated with Ctrl+Alt+Enter in any Pydev Editor.\n\n", p){
//            @Override
//            public String getLabelTextCol1() {
//                return "Note:\n\n";
//            }
//
//        });
//        addField(new BooleanFieldEditor(SHOW_CONSOLE_INPUT, "Show the input given to the console?", p));
//        addField(new BooleanFieldEditor(EVAL_ON_NEW_LINE, "Evaluate on console on each new line (or only on request)?", p));
//        addField(new MultiStringFieldEditor(INITIAL_INTERPRETER_CMDS, "Initial\ninterpreter\ncommands:\n", p));
//        addField(new StringFieldEditor(INTERACTIVE_CONSOLE_VM_ARGS, "Vm Args for jython\n(used only on external\nprocess option):", p));
//    }
//
//    public void init(IWorkbench workbench) {
//    }
//
//    /**
//     * should we show the inputs that are given to the console?
//     */
//    public static boolean showConsoleInput() {
//        return PydevPlugin.getDefault().getPreferenceStore().getBoolean(SHOW_CONSOLE_INPUT);
//    }
//    
//    /**
//     * should we evaluate on each new line or only on request?
//     */
//    public static boolean evalOnNewLine() {
//        return PydevPlugin.getDefault().getPreferenceStore().getBoolean(EVAL_ON_NEW_LINE);
//    }
//    
//    /**
//     * The initial commonds to pass to the interpreter
//     */
//    public static String getInitialInterpreterCmds() {
//        return PydevPlugin.getDefault().getPreferenceStore().getString(INITIAL_INTERPRETER_CMDS);
//    }
//    
//    /**
//     * The vm args to pass to the interpreter
//     */
//    public static String getInteractiveConsoleVmArgs() {
//        return PydevPlugin.getDefault().getPreferenceStore().getString(INTERACTIVE_CONSOLE_VM_ARGS);
//    }
//
//}
