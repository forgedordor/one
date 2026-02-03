package defpackage;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epxt extends Structure implements Structure.ByValue {
    public Callback destructor = epzi.INSTANCE;
    public Pointer size = new Pointer(0);
    public Pointer alignment = new Pointer(0);
    public eqaa run_delete_callback = new epxq();
    public eqab run_deleteExpired_callback = new epxp();
    public eqad run_insert_callback = new epxs();
    public eqac run_get_callback = new epxr();

    @Override // com.sun.jna.Structure
    protected final List<String> getFieldOrder() {
        return fcva.g("destructor", "size", "alignment", "run_delete_callback", "run_deleteExpired_callback", "run_insert_callback", "run_get_callback");
    }
}
