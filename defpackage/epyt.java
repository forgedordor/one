package defpackage;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epyt extends Structure implements Structure.ByValue {
    public Callback destructor = eqby.INSTANCE;
    public Pointer size = new Pointer(0);
    public Pointer alignment = new Pointer(0);
    public eqak run_state_callback = new epyr();
    public eqal run_write_callback = new epys();
    public eqaj run_delete_callback = new epyq();

    @Override // com.sun.jna.Structure
    protected final List<String> getFieldOrder() {
        return fcva.g("destructor", "size", "alignment", "run_state_callback", "run_write_callback", "run_delete_callback");
    }
}
