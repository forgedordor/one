package defpackage;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epyp extends Structure implements Structure.ByValue {
    public Pointer data_ = new Pointer(0);
    public epym vtable = new epym();

    @Override // com.sun.jna.Structure
    protected final List<String> getFieldOrder() {
        return fcva.g("data_", "vtable");
    }
}
