package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euxj {
    public static ByteBuffer a(euxl euxlVar) {
        euxm euxmVarA = euxlVar.a();
        if (((euxe) euxmVarA.a()).b == 2) {
            return ((euxk) euxmVarA).a.asReadOnlyBuffer().order(ByteOrder.nativeOrder());
        }
        throw new IllegalArgumentException("Extract ByteBuffer from a MPImage created by objects other than Bytebuffer is not supported");
    }
}
