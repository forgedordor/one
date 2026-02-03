package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsxi implements dswz {
    final /* synthetic */ dsxj a;
    private int b = -1;

    public dsxi(dsxj dsxjVar) {
        this.a = dsxjVar;
    }

    @Override // defpackage.dswz
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(dsvd dsvdVar) {
        ejwl.l(dsvdVar.e());
        dsvp dsvpVar = dsvdVar.c;
        eohx eohxVar = ((dsvq) dsvpVar.instance).d;
        if (eohxVar == null) {
            eohxVar = eohx.a;
        }
        ejwl.l((eohxVar.b & 2048) != 0);
        int iB = emmy.b(((dsvq) dsvpVar.instance).e);
        if (iB == 0 || iB == 1) {
            dsxj dsxjVar = this.a;
            List list = dsxjVar.e;
            int size = list.size();
            list.add(dsvdVar.a());
            dsxjVar.f.put(size, this.b);
            int i = this.b;
            this.b = size;
            dsvdVar.f.n(this);
            this.b = i;
        }
    }
}
