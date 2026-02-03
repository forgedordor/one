package defpackage;

import java.net.URL;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rni implements rlq {
    private final rlq a;

    public rni(rlq rlqVar) {
        this.a = rlqVar;
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) {
        return this.a.a(new rlc((URL) obj), i, i2, rexVar);
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
