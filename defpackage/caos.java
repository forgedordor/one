package defpackage;

import android.text.TextUtils;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caos implements bzaa {
    private final cpmc a;
    private final byrw b;
    private final autx c;

    public caos(cpmc cpmcVar, byrw byrwVar, autx autxVar) {
        this.a = cpmcVar;
        this.b = byrwVar;
        this.c = autxVar;
    }

    @Override // defpackage.bzaa
    public final aumn a() {
        return aumn.ENCRYPTION_KEYS;
    }

    @Override // defpackage.bzaa
    public final bmra b() {
        return bmra.ENCRYPTION_KEY_OBJECT;
    }

    @Override // defpackage.bzaa
    public final bykl c() {
        return this.b;
    }

    @Override // defpackage.bzaa
    public final eiju d(String str) {
        return TextUtils.isEmpty(str) ? this.a.F() : this.a.G(str);
    }

    @Override // defpackage.bzaa
    public final eiju e(pzs pzsVar) {
        final autt auttVar = autt.RESTORE;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Function function = new Function() { // from class: auny
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aumg aumgVar = (aumg) obj;
                cqce cqceVar = aurx.a;
                autt auttVarB = autt.b(((aumq) aumgVar.instance).f);
                if (auttVarB == null) {
                    auttVarB = autt.INITIAL_SYNC_STATUS_NOT_SET;
                }
                autt auttVar2 = auttVar;
                if (auttVarB.equals(autt.RESTORE) && auttVar2.equals(autt.BACKUP)) {
                    atomicBoolean.set(true);
                }
                aumgVar.copyOnWrite();
                aumq aumqVar = (aumq) aumgVar.instance;
                aumqVar.f = auttVar2.j;
                aumqVar.b |= 4;
                return aumgVar;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        final aurx aurxVar = this.c.a;
        return aurxVar.A(function, new Function() { // from class: aunz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aurx aurxVar2 = aurxVar;
                aurxVar2.K();
                if (!atomicBoolean.get()) {
                    return null;
                }
                aurxVar2.M();
                return null;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        });
    }

    @Override // defpackage.bzaa
    public final emec f() {
        return emec.RESTORE_ENCRYPTION_KEY;
    }

    @Override // defpackage.bzaa
    public final /* synthetic */ String g(Object obj) {
        return ((eqnd) obj).c;
    }

    @Override // defpackage.bzaa
    public final String h() {
        return "Encryption Keys";
    }
}
