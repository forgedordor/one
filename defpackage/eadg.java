package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eadg {
    public final ejvr a;
    public ekhx b = ekon.a;
    public boolean c = false;
    public boolean d = false;

    public eadg(ejvr ejvrVar) {
        this.a = ejvrVar;
    }

    public final eadc a() {
        return new eadf(new eadc() { // from class: eadd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eadc
            public final eadb a(final dzyn dzynVar) {
                eadb eadbVar;
                eadb[] eadbVarArr;
                int length;
                eadg eadgVar = this.a;
                ejvr ejvrVar = eadgVar.a;
                eada eadaVar = eadb.a;
                Context context = dzynVar.d;
                final String str = (String) ejvrVar.apply(context);
                final boolean z = eadgVar.c;
                final boolean z2 = eadgVar.d;
                final ekhx ekhxVar = eadgVar.b;
                ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: eacv
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return new eadb(dzynVar, str, z, z2, ekhxVar);
                    }
                });
                AtomicReference atomicReference = (AtomicReference) ConcurrentMap.EL.computeIfAbsent(eadaVar.b, str, new Function() { // from class: eacw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return new AtomicReference();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                loop0: while (true) {
                    eadb[] eadbVarArr2 = (eadb[]) atomicReference.get();
                    if (eadbVarArr2 == null || (length = eadbVarArr2.length) == 0) {
                        eadb eadbVar2 = (eadb) ejxrVarA.get();
                        eadbVar = eadbVar2;
                        eadbVarArr = new eadb[]{eadbVar2};
                    } else {
                        eadb eadbVar3 = eadbVarArr2[0];
                        if (eadbVar3.e.equals("")) {
                            eadbVar = eadbVar3;
                            eadbVarArr = null;
                        } else {
                            eadbVar = (eadb) ejxrVarA.get();
                            eadbVarArr = new eadb[length + 1];
                            eadbVarArr[0] = eadbVar;
                            System.arraycopy(eadbVarArr2, 0, eadbVarArr, 1, length);
                        }
                    }
                    if (eadbVarArr == null) {
                        break;
                    }
                    while (!atomicReference.compareAndSet(eadbVarArr2, eadbVarArr)) {
                        if (atomicReference.get() != eadbVarArr2) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (eadbVarArr != null) {
                    eacx eacxVar = new eacx(eadaVar);
                    eacy eacyVar = new eacy(eadaVar);
                    if (eaeo.a == null) {
                        synchronized (eaeo.class) {
                            if (eaeo.a == null) {
                                if (!Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                                    if (dcni.c()) {
                                        context.registerReceiver(new eaeo(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context.registerReceiver(new eaeo(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                eaeo.a = eacxVar;
                                eaeo.b = eacyVar;
                            }
                        }
                    }
                }
                boolean z3 = eadbVar.f;
                ejwl.f(true, "Package %s cannot be registered both with and without stickyAccountSupport", str);
                return eadbVar;
            }
        });
    }

    public final void b() {
        this.d = true;
    }

    public final void c(Set set) {
        this.b = ekhx.o(set);
    }
}
