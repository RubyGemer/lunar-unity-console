package spacemadness.com.lunarconsole.console.actions;

import java.util.ArrayList;
import java.util.List;

import spacemadness.com.lunarconsole.utils.LUSortedList;
import spacemadness.com.lunarconsole.utils.NotImplementedException;

/**
 * Created by alementuev on 12/13/16.
 */

public class LUActionRegistry
{
    private final LUSortedList<LUAction> actions;
    private final LUSortedList<LUCVar> variables;
    private Delegate delegate; // FIXME: rename

    public LUActionRegistry()
    {
        actions = new LUSortedList<>();
        variables = new LUSortedList<>();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    // Actions

    public LUAction registerActionWithId(int actionId, String name)
    {
        throw new NotImplementedException();
    }

    public boolean unregisterActionWithId(int actionId)
    {
        throw new NotImplementedException();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    // Variables

    public LUCVar registerVariableWithId(int variableId, String name, LUCVarType type, String value, String defaultValue)
    {
        throw new NotImplementedException();
    }

    public void setValue(String value, int variableId)
    {
        throw new NotImplementedException();
    }

    public LUCVar variableWithId(int variableId)
    {
        throw new NotImplementedException();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    // Getters/Setters

    public LUSortedList<LUAction> actions()
    {
        return actions;
    }

    public LUSortedList<LUCVar> variables()
    {
        return variables;
    }

    public Delegate getDelegate()
    {
        return delegate;
    }

    public void setDelegate(Delegate delegate)
    {
        this.delegate = delegate;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    // Delegate

    public interface Delegate // FIXME: rename
    {
        void didAddAction(LUActionRegistry registry, LUAction action);
        void didRemoveAction(LUActionRegistry registry, LUAction action);
        void didRegisterVariable(LUActionRegistry registry, LUCVar variable);
        void didDidChangeVariable(LUActionRegistry registry, LUCVar variable);
    }
}
