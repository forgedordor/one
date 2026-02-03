package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjea extends cjcp {
    public static final cjdz a = new cjdz();
    private final fcsu b;

    public cjea(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    @Override // defpackage.cjcp
    /* renamed from: a */
    public final audk apply(final cjjh cjjhVar) {
        ejwl.b(cjjhVar.c == 4, "Unexpected missing groupInformation");
        cjme cjmeVar = (cjjhVar.c == 4 ? (cjhu) cjjhVar.d : cjhu.a).e;
        if (cjmeVar == null) {
            cjmeVar = cjme.a;
        }
        ejwl.b(!cjmeVar.c.isEmpty(), "Unexpected empty conversation URI ");
        ejwl.b(!r0.c.isEmpty(), "Unexpected empty group conversation id");
        audj audjVar = (audj) audk.b.createBuilder();
        cjgr cjgrVar = cjjhVar.e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjjr cjjrVar = cjgrVar.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        String str = cjjrVar.c;
        audjVar.copyOnWrite();
        audk audkVar = (audk) audjVar.instance;
        str.getClass();
        audkVar.c |= 1;
        audkVar.d = str;
        aubn aubnVar = (aubn) aubq.a.createBuilder();
        aubp aubpVar = aubp.GROUP;
        aubnVar.copyOnWrite();
        aubq aubqVar = (aubq) aubnVar.instance;
        aubqVar.c = aubpVar.f;
        aubqVar.b |= 1;
        cjgr cjgrVar2 = cjjhVar.e;
        if (cjgrVar2 == null) {
            cjgrVar2 = cjgr.a;
        }
        cjju cjjuVar = cjgrVar2.d;
        if (cjjuVar == null) {
            cjjuVar = cjju.a;
        }
        String str2 = (cjjuVar.b == 2 ? (cjme) cjjuVar.c : cjme.a).c;
        aubnVar.copyOnWrite();
        aubq aubqVar2 = (aubq) aubnVar.instance;
        str2.getClass();
        aubqVar2.b |= 2;
        aubqVar2.d = str2;
        aubq aubqVar3 = (aubq) aubnVar.build();
        audjVar.copyOnWrite();
        audk audkVar2 = (audk) audjVar.instance;
        aubqVar3.getClass();
        audkVar2.f = aubqVar3;
        audkVar2.c |= 8;
        int i = cjjhVar.c;
        if (((i == 4 ? (cjhu) cjjhVar.d : cjhu.a).b & 8) != 0) {
            cjhq cjhqVar = (i == 4 ? (cjhu) cjjhVar.d : cjhu.a).g;
            if (cjhqVar == null) {
                cjhqVar = cjhq.a;
            }
            if (cjhqVar.c) {
                audjVar.c(aucp.SUBJECT_UPDATE);
            }
            cjhq cjhqVar2 = (cjjhVar.c == 4 ? (cjhu) cjjhVar.d : cjhu.a).g;
            if (cjhqVar2 == null) {
                cjhqVar2 = cjhq.a;
            }
            int iA = cjhp.a(cjhqVar2.d);
            if (iA == 0) {
                iA = 1;
            }
            int i2 = iA - 1;
            if (i2 == 1) {
                audjVar.c(aucp.REMOVE_PARTICIPANT_BY_ADMIN);
            } else if (i2 == 2) {
                audjVar.c(aucp.REMOVE_PARTICIPANT_BY_ALL);
            }
        }
        Stream map = Collection.EL.stream((cjjhVar.c == 4 ? (cjhu) cjjhVar.d : cjhu.a).f).map(new Function() { // from class: cjdy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cjhy cjhyVar = (cjhy) obj;
                aueh auehVar = (aueh) auek.a.createBuilder();
                cjjh cjjhVar2 = cjjhVar;
                cjgr cjgrVar3 = cjjhVar2.e;
                if (cjgrVar3 == null) {
                    cjgrVar3 = cjgr.a;
                }
                cjju cjjuVar2 = cjhyVar.d;
                if (cjjuVar2 == null) {
                    cjjuVar2 = cjju.a;
                }
                aubq aubqVarA = cjel.a(cjgrVar3, cjjuVar2);
                auehVar.copyOnWrite();
                auek auekVar = (auek) auehVar.instance;
                aubqVarA.getClass();
                auekVar.c = aubqVarA;
                auekVar.b |= 1;
                cjdz cjdzVar = cjea.a;
                cjhx cjhxVarB = cjhx.b(cjhyVar.g);
                if (cjhxVarB == null) {
                    cjhxVarB = cjhx.UNKNOWN_TYPE;
                }
                auej auejVar = (auej) cjdzVar.fM(cjhxVarB);
                auehVar.copyOnWrite();
                auek auekVar2 = (auek) auehVar.instance;
                auekVar2.d = auejVar.e;
                auekVar2.b |= 2;
                if ((cjhyVar.b & 4) != 0) {
                    aufa aufaVar = (aufa) aufb.a.createBuilder();
                    cjgr cjgrVar4 = cjjhVar2.e;
                    if (cjgrVar4 == null) {
                        cjgrVar4 = cjgr.a;
                    }
                    cjju cjjuVar3 = cjhyVar.e;
                    if (cjjuVar3 == null) {
                        cjjuVar3 = cjju.a;
                    }
                    aubq aubqVarA2 = cjel.a(cjgrVar4, cjjuVar3);
                    aufaVar.copyOnWrite();
                    aufb aufbVar = (aufb) aufaVar.instance;
                    aubqVarA2.getClass();
                    aufbVar.c = aubqVarA2;
                    aufbVar.b |= 1;
                    auehVar.copyOnWrite();
                    auek auekVar3 = (auek) auehVar.instance;
                    aufb aufbVar2 = (aufb) aufaVar.build();
                    aufbVar2.getClass();
                    auekVar3.e = aufbVar2;
                    auekVar3.b |= 4;
                }
                return (auek) auehVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i3 = ekgb.d;
        audjVar.b((Iterable) map.collect(ekcv.a));
        if (((cjjhVar.c == 4 ? (cjhu) cjjhVar.d : cjhu.a).b & 2) != 0) {
            aues auesVar = (aues) auet.a.createBuilder();
            String str3 = (cjjhVar.c == 4 ? (cjhu) cjjhVar.d : cjhu.a).d;
            auesVar.copyOnWrite();
            auet auetVar = (auet) auesVar.instance;
            str3.getClass();
            auetVar.b |= 1;
            auetVar.c = str3;
            if (((cjjhVar.c == 4 ? (cjhu) cjjhVar.d : cjhu.a).b & 16) != 0) {
                aufa aufaVar = (aufa) aufb.a.createBuilder();
                cjgr cjgrVar3 = cjjhVar.e;
                if (cjgrVar3 == null) {
                    cjgrVar3 = cjgr.a;
                }
                cjlk cjlkVar = (cjjhVar.c == 4 ? (cjhu) cjjhVar.d : cjhu.a).h;
                if (cjlkVar == null) {
                    cjlkVar = cjlk.a;
                }
                cjju cjjuVar2 = cjlkVar.c;
                if (cjjuVar2 == null) {
                    cjjuVar2 = cjju.a;
                }
                aubq aubqVarA = cjel.a(cjgrVar3, cjjuVar2);
                aufaVar.copyOnWrite();
                aufb aufbVar = (aufb) aufaVar.instance;
                aubqVarA.getClass();
                aufbVar.c = aubqVarA;
                aufbVar.b = 1 | aufbVar.b;
                int i4 = cjjhVar.c;
                cjlk cjlkVar2 = (i4 == 4 ? (cjhu) cjjhVar.d : cjhu.a).h;
                if (cjlkVar2 == null) {
                    cjlkVar2 = cjlk.a;
                }
                if ((cjlkVar2.b & 2) != 0) {
                    cjlk cjlkVar3 = (i4 == 4 ? (cjhu) cjjhVar.d : cjhu.a).h;
                    if (cjlkVar3 == null) {
                        cjlkVar3 = cjlk.a;
                    }
                    evvp evvpVar = cjlkVar3.d;
                    if (evvpVar == null) {
                        evvpVar = evvp.a;
                    }
                    aufaVar.copyOnWrite();
                    aufb aufbVar2 = (aufb) aufaVar.instance;
                    evvpVar.getClass();
                    aufbVar2.d = evvpVar;
                    aufbVar2.b |= 2;
                }
                auesVar.copyOnWrite();
                auet auetVar2 = (auet) auesVar.instance;
                aufb aufbVar3 = (aufb) aufaVar.build();
                aufbVar3.getClass();
                auetVar2.d = aufbVar3;
                auetVar2.b |= 2;
            }
            audjVar.copyOnWrite();
            audk audkVar3 = (audk) audjVar.instance;
            auet auetVar3 = (auet) auesVar.build();
            auetVar3.getClass();
            audkVar3.i = auetVar3;
            audkVar3.c |= 16;
        }
        aubq aubqVar4 = (aubq) ((cejp) this.b.b()).b().orElseThrow(new Supplier() { // from class: cjdx
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalArgumentException("RCS self identity is not present.");
            }
        });
        audjVar.copyOnWrite();
        audk audkVar4 = (audk) audjVar.instance;
        aubqVar4.getClass();
        audkVar4.m = aubqVar4;
        audkVar4.c |= 256;
        return (audk) audjVar.build();
    }

    @Override // defpackage.cjcp, java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        return apply((cjjh) obj);
    }
}
