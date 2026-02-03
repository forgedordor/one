package defpackage;

import com.google.android.ims.provisioning.config.WelcomeMessage;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjyh implements cmit {
    final /* synthetic */ fcsu a;
    final /* synthetic */ fcsu b;
    final /* synthetic */ fcsu c;

    public cjyh(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    @Override // defpackage.cmit
    public final Optional a() {
        final fcsu fcsuVar = this.a;
        Optional optionalM = ((chwq) fcsuVar.b()).m();
        final fdap fdapVar = new fdap() { // from class: cjyd
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                WelcomeMessage welcomeMessage = (WelcomeMessage) obj;
                dfiq dfiqVar = (dfiq) dfir.a.createBuilder();
                dfiqVar.getClass();
                String str = welcomeMessage.mMessage;
                str.getClass();
                dfiqVar.copyOnWrite();
                dfir dfirVar = (dfir) dfiqVar.instance;
                dfirVar.b |= 1;
                dfirVar.c = str;
                String str2 = welcomeMessage.mTitle;
                str2.getClass();
                dfiqVar.copyOnWrite();
                dfir dfirVar2 = (dfir) dfiqVar.instance;
                dfirVar2.b |= 2;
                dfirVar2.d = str2;
                boolean z = welcomeMessage.mHasAcceptButton;
                dfiqVar.copyOnWrite();
                dfir dfirVar3 = (dfir) dfiqVar.instance;
                dfirVar3.b |= 4;
                dfirVar3.e = z;
                boolean z2 = welcomeMessage.mHasRejectButton;
                dfiqVar.copyOnWrite();
                dfir dfirVar4 = (dfir) dfiqVar.instance;
                dfirVar4.b |= 8;
                dfirVar4.f = z2;
                boolean z3 = welcomeMessage.hasSettingsButton;
                dfiqVar.copyOnWrite();
                dfir dfirVar5 = (dfir) dfiqVar.instance;
                dfirVar5.b |= 16;
                dfirVar5.g = z3;
                evsn evsnVarBuild = dfiqVar.build();
                evsnVarBuild.getClass();
                return (dfir) evsnVarBuild;
            }
        };
        Optional map = optionalM.map(new Function() { // from class: cjye
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map.getClass();
        final dfir dfirVar = (dfir) fdct.a(map, dfir.a);
        Optional optionalH = ((cmlb) this.b.b()).h(cmla.a);
        final fdap fdapVar2 = new fdap() { // from class: cjyf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cmmh cmmhVar = (cmmh) obj;
                cjzi cjziVar = (cjzi) cjzm.a.createBuilder();
                cjziVar.getClass();
                DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cjzm) cjziVar.instance).b)).getClass();
                String str = cmmhVar.c;
                str.getClass();
                dfir dfirVar2 = dfirVar;
                dfirVar2.getClass();
                cjziVar.a(str, dfirVar2);
                DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cjzm) cjziVar.instance).c)).getClass();
                String str2 = cmmhVar.c;
                str2.getClass();
                cjziVar.b(str2, ((chwq) fcsuVar.b()).C());
                evsn evsnVarBuild = cjziVar.build();
                evsnVarBuild.getClass();
                return (cjzm) evsnVarBuild;
            }
        };
        Optional map2 = optionalH.map(new Function() { // from class: cjyg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar2.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map2.getClass();
        return map2;
    }

    @Override // defpackage.cmis
    public final void c() {
        ((ains) this.c.b()).c("Bugle.Rcs.CarrierTos.Data.Migration.Counts");
    }

    @Override // defpackage.cmit
    public final void b() {
    }
}
