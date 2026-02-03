package defpackage;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epxo extends Structure implements Structure.ByValue {
    public Pointer data_ = new Pointer(0);
    public epxf vtable = new epxf();

    @Override // com.sun.jna.Structure
    protected final List<String> getFieldOrder() {
        return fcva.g("data_", "vtable");
    }
}
