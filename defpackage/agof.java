package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agof implements agnw {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/otp/deletion/data/OtpDeletionDataServiceImpl");
    public final eosc b;
    public final eosc c;
    public final ecjh d;
    public final egzh e;
    public final fcsu f;
    private final fcsu g;

    public agof(eosc eoscVar, eosc eoscVar2, ecjh ecjhVar, egzh egzhVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = eoscVar;
        this.c = eoscVar2;
        this.d = ecjhVar;
        this.e = egzhVar;
        this.g = fcsuVar;
        this.f = fcsuVar2;
    }

    public static boolean d() {
        bpzs bpzsVarA = bpzx.a();
        bpzsVarA.A("hasOtpMessage");
        bpzsVarA.d(new Function() { // from class: agny
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bpzc) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bpzsVarA.A("hasOtpMessage3");
        bpzsVarA.e(new Function() { // from class: agnz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpzw bpzwVar = (bpzw) obj;
                bpzwVar.b(1);
                return bpzwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bpzsVarA.b().U();
    }

    @Override // defpackage.agnw
    public final eiju a() {
        eieu eieuVarK = eiiy.k("OtpDeletionDataServiceImpl#isAutoDeletionEnabled");
        try {
            eiju eijuVarH = eiju.g(this.d.a()).h(new ejvr() { // from class: agoa
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((agoh) obj).c);
                }
            }, this.b);
            eieuVarK.b(eijuVarH);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.agnw
    public final eiju b(final boolean z) {
        ejvr ejvrVar = new ejvr() { // from class: agob
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                agog agogVar = (agog) ((agoh) obj).toBuilder();
                agogVar.copyOnWrite();
                ((agoh) agogVar.instance).c = z;
                return (agoh) agogVar.build();
            }
        };
        eosc eoscVar = this.b;
        eiju eijuVarH = eiju.g(this.d.b(ejvrVar, eoscVar)).h(new ejvr() { // from class: agoc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.e.a(eijx.e(null), "otp_deletion_preference_data_source_key");
                return null;
            }
        }, eoscVar);
        ((agoo) this.g.b()).b(new Supplier() { // from class: agon
            @Override // java.util.function.Supplier
            public final Object get() {
                eniy eniyVar = (eniy) enjk.a.createBuilder();
                enjh enjhVar = (enjh) enjj.a.createBuilder();
                enjhVar.copyOnWrite();
                enjj enjjVar = (enjj) enjhVar.instance;
                enjjVar.c = (true != z ? 3 : 2) - 1;
                enjjVar.b |= 1;
                eniyVar.copyOnWrite();
                enjk enjkVar = (enjk) eniyVar.instance;
                enjj enjjVar2 = (enjj) enjhVar.build();
                enjjVar2.getClass();
                enjkVar.c = enjjVar2;
                enjkVar.b = 3;
                return (enjk) eniyVar.build();
            }
        });
        return eijuVarH;
    }

    @Override // defpackage.agnw
    public final eiju c() {
        return eiju.g(this.d.b(new ejvr() { // from class: agoe
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                agog agogVar = (agog) ((agoh) obj).toBuilder();
                agogVar.copyOnWrite();
                ((agoh) agogVar.instance).d = true;
                return (agoh) agogVar.build();
            }
        }, this.b));
    }
}
