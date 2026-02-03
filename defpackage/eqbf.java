package defpackage;

import com.sun.jna.Structure;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqbf extends Structure implements Structure.ByValue {
    public int result = eqba.a.ordinal();
    public int context = eqbq.a.ordinal();

    @Override // com.sun.jna.Structure
    protected final List<String> getFieldOrder() {
        return fcva.g("result", "context");
    }
}
