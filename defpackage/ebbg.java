package defpackage;

import android.os.Build;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebbg {
    public static final /* synthetic */ int a = 0;
    private static final ekgp b;
    private final ejsu c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("arm64-v8a", ejsr.ARM_64);
        ekgiVar.i("armeabi-v7a", ejsr.ARM_32);
        ekgiVar.i("x86_64", ejsr.X86_64);
        ekgiVar.i("x86", ejsr.X86_32);
        b = ekgiVar.c();
    }

    public ebbg(String str) {
        ejss ejssVar = (ejss) ejsu.a.createBuilder();
        String str2 = Build.BOARD;
        ejssVar.copyOnWrite();
        ejsu ejsuVar = (ejsu) ejssVar.instance;
        str2.getClass();
        ejsuVar.d = str2;
        String str3 = Build.VERSION.RELEASE;
        ejssVar.copyOnWrite();
        ejsu ejsuVar2 = (ejsu) ejssVar.instance;
        str3.getClass();
        ejsuVar2.f = str3;
        ejssVar.copyOnWrite();
        ((ejsu) ejssVar.instance).b = ejst.a(5);
        if (Build.SUPPORTED_ABIS.length > 0) {
            ekgp ekgpVar = b;
            if (ekgpVar.containsKey(ejuf.c(Build.SUPPORTED_ABIS[0]))) {
                ejsr ejsrVar = (ejsr) ekgpVar.getOrDefault(ejuf.c(Build.SUPPORTED_ABIS[0]), ejsr.UNKNOWN_ARCH);
                ejssVar.copyOnWrite();
                ((ejsu) ejssVar.instance).c = ejsrVar.a();
            }
        }
        if (!ejwk.c(str)) {
            ejssVar.copyOnWrite();
            ((ejsu) ejssVar.instance).g = str;
        }
        this.c = (ejsu) ejssVar.build();
    }

    public final ejsu a(final ejsi ejsiVar, ekik ekikVar) {
        ejss ejssVar = (ejss) ejsu.a.createBuilder();
        Iterator<T> it = new evsz(ejsiVar.n, ejsi.a).iterator();
        while (it.hasNext()) {
            int i = 0;
            switch ((ejsv) it.next()) {
                case OS:
                    int i2 = this.c.b;
                    if (i2 == 0) {
                        i = 2;
                    } else if (i2 == 1) {
                        i = 3;
                    } else if (i2 == 2) {
                        i = 4;
                    } else if (i2 == 3) {
                        i = 5;
                    }
                    int i3 = i != 0 ? i : 1;
                    ejssVar.copyOnWrite();
                    ((ejsu) ejssVar.instance).b = ejst.a(i3);
                    break;
                case ARCH:
                    int i4 = this.c.c;
                    ejsr ejsrVar = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? null : ejsr.ARM_32 : ejsr.X86_32 : ejsr.X86 : ejsr.ARM_64 : ejsr.X86_64 : ejsr.UNKNOWN_ARCH;
                    if (ejsrVar == null) {
                        ejsrVar = ejsr.UNRECOGNIZED;
                    }
                    ejssVar.copyOnWrite();
                    ((ejsu) ejssVar.instance).c = ejsrVar.a();
                    break;
                case BOARD_NAME:
                    String str = this.c.d;
                    ejssVar.copyOnWrite();
                    ejsu ejsuVar = (ejsu) ejssVar.instance;
                    str.getClass();
                    ejsuVar.d = str;
                    break;
                case PRODUCT_NAME:
                    String str2 = this.c.e;
                    ejssVar.copyOnWrite();
                    ejsu ejsuVar2 = (ejsu) ejssVar.instance;
                    str2.getClass();
                    ejsuVar2.e = str2;
                    break;
                case SYSTEM_VERSION:
                    String str3 = this.c.f;
                    ejssVar.copyOnWrite();
                    ejsu ejsuVar3 = (ejsu) ejssVar.instance;
                    str3.getClass();
                    ejsuVar3.f = str3;
                    break;
                case APP_VERSION:
                    String str4 = this.c.g;
                    ejssVar.copyOnWrite();
                    ejsu ejsuVar4 = (ejsu) ejssVar.instance;
                    str4.getClass();
                    ejsuVar4.g = str4;
                    break;
                case CHANNEL:
                    String str5 = this.c.h;
                    ejssVar.copyOnWrite();
                    ejsu ejsuVar5 = (ejsu) ejssVar.instance;
                    str5.getClass();
                    ejsuVar5.h = str5;
                    break;
                case BUILD_TYPE:
                    int i5 = this.c.i;
                    if (i5 == 0) {
                        i = 2;
                    } else if (i5 == 1) {
                        i = 3;
                    } else if (i5 == 2) {
                        i = 4;
                    } else if (i5 == 3) {
                        i = 5;
                    } else if (i5 == 4) {
                        i = 6;
                    }
                    if (i == 0) {
                        i = 1;
                    }
                    ejssVar.copyOnWrite();
                    ejsu ejsuVar6 = (ejsu) ejssVar.instance;
                    if (i == 1) {
                        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                    }
                    ejsuVar6.i = i - 2;
                    break;
                case EXPERIMENT_IDS:
                    Stream streamFilter = Collection.EL.stream(ekikVar).filter(new Predicate() { // from class: ebbf
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            int i6 = ebbg.a;
                            return ejsiVar.o.contains((Long) obj);
                        }
                    });
                    int i6 = ekgb.d;
                    Iterable iterable = (Iterable) streamFilter.collect(ekcv.a);
                    ejssVar.copyOnWrite();
                    ejsu ejsuVar7 = (ejsu) ejssVar.instance;
                    evta evtaVar = ejsuVar7.j;
                    if (!evtaVar.c()) {
                        ejsuVar7.j = evsn.mutableCopy(evtaVar);
                    }
                    evpz.addAll(iterable, ejsuVar7.j);
                    break;
                case UNRECOGNIZED:
                    throw new AssertionError("Unrecognized SystemProfileField");
            }
        }
        return (ejsu) ejssVar.build();
    }
}
