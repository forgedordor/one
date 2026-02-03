package defpackage;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epym extends Structure implements Structure.ByValue {
    public Callback destructor = eqbg.INSTANCE;
    public Pointer size = new Pointer(0);
    public Pointer alignment = new Pointer(0);
    public eqai run_getCurrentTimeMs_callback = new epyl();

    @Override // com.sun.jna.Structure
    protected final List<String> getFieldOrder() {
        return fcva.g("destructor", "size", "alignment", "run_getCurrentTimeMs_callback");
    }
}
