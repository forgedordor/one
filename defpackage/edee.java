package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edee implements rlr {
    final /* synthetic */ eddw a;
    final /* synthetic */ rlo b;

    public edee(eddw eddwVar, rlo rloVar) {
        this.a = eddwVar;
        this.b = rloVar;
    }

    @Override // defpackage.rlr
    public final rlq b(rlz rlzVar) {
        return new edec(new drft(rlzVar.a(rlc.class, ByteBuffer.class), this.a, this.b, ByteBuffer.class));
    }
}
