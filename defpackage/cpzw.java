package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpzw implements cpzp {
    private final aurx a;
    private final autx b;
    private final appi c;
    private final aukh d;

    public cpzw(aurx aurxVar, autx autxVar, appi appiVar, aukh aukhVar) {
        this.a = aurxVar;
        this.b = autxVar;
        this.c = appiVar;
        this.d = aukhVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [cmfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [cmfo, java.lang.Object] */
    @Override // defpackage.cpzp
    public final void a() {
        aurx aurxVar = this.a;
        aurxVar.X(false);
        if (cpyl.a() && ((Boolean) ((cczi) cpxw.l.get()).e()).booleanValue()) {
            aurxVar.R(auml.DISABLING, false);
            this.b.f(false);
        } else {
            aurxVar.Q(auml.DISABLING);
            this.b.e();
        }
        aurxVar.F();
        aurxVar.P();
        aurxVar.G();
        aurxVar.ag(false);
        ecem.b();
        ejxr ejxrVar = aurxVar.e;
        ejxrVar.get().m(new ejvr() { // from class: aums
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.b &= -2097153;
                aumqVar.x = false;
                return builder.build();
            }
        });
        aurxVar.L();
        ecem.b();
        ejxrVar.get().m(new ejvr() { // from class: auqj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                aump aumpVar = ((aumq) builder.instance).z;
                if (aumpVar == null) {
                    aumpVar = aump.a;
                }
                aumo aumoVar = (aumo) aumpVar.toBuilder();
                aumoVar.copyOnWrite();
                aump aumpVar2 = (aump) aumoVar.instance;
                aumpVar2.b &= -2;
                aumpVar2.c = 0L;
                aump aumpVar3 = (aump) aumoVar.build();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumpVar3.getClass();
                aumqVar.z = aumpVar3;
                aumqVar.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
                return builder.build();
            }
        });
        aurxVar.L();
        if (this.c.a()) {
            aurxVar.O();
        }
        this.d.a();
    }
}
