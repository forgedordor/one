package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsjc extends dshh {
    static final ejvj a = new dsjs();
    static final ejvr b = new dsiu();

    @Override // defpackage.dshh
    public final void a(evnw evnwVar, etkz etkzVar) {
        if (evnwVar.b == 3) {
            etmd etmdVar = (etmd) etme.a.createBuilder();
            String str = (evnwVar.b == 3 ? (evoe) evnwVar.c : evoe.a).b;
            etmdVar.copyOnWrite();
            etme etmeVar = (etme) etmdVar.instance;
            str.getClass();
            etmeVar.b |= 1;
            etmeVar.c = str;
            boolean z = (evnwVar.b == 3 ? (evoe) evnwVar.c : evoe.a).c;
            etmdVar.copyOnWrite();
            etme etmeVar2 = (etme) etmdVar.instance;
            etmeVar2.b |= 2;
            etmeVar2.d = z;
            etkzVar.copyOnWrite();
            etla etlaVar = (etla) etkzVar.instance;
            etme etmeVar3 = (etme) etmdVar.build();
            etla etlaVar2 = etla.a;
            etmeVar3.getClass();
            etlaVar.c = etmeVar3;
            etlaVar.b = 3;
        }
    }
}
