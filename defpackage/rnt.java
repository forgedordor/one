package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rnt implements rez {
    private final ron a;

    public rnt(ron ronVar) {
        this.a = ronVar;
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ rhy a(Object obj, int i, int i2, rex rexVar) {
        ron ronVar = this.a;
        return ronVar.a(new roy((ByteBuffer) obj, ronVar.g, ronVar.f), i, i2, rexVar, ron.e);
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ boolean b(Object obj, rex rexVar) {
        return true;
    }
}
