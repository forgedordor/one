package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsvo {
    public static dsva a(int i) {
        ejwl.a(i >= 0);
        evsl evslVar = dsxq.a;
        dsxt dsxtVar = (dsxt) dsxu.a.createBuilder();
        dsxtVar.copyOnWrite();
        dsxu dsxuVar = (dsxu) dsxtVar.instance;
        dsxuVar.b = 1 | dsxuVar.b;
        dsxuVar.c = i;
        return new dsva(evslVar, (dsxu) dsxtVar.build());
    }
}
