package defpackage;

import com.google.android.apps.messaging.home.minidetailspage.MiniConversationDetailsPageViewModel;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adbg implements fdat {
    final /* synthetic */ adbm a;

    public adbg(adbm adbmVar) {
        this.a = adbmVar;
    }

    public static final cwem b(hsf hsfVar) {
        return (cwem) hsfVar.a();
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        final long j;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            adbm adbmVar = this.a;
            if (((int[]) hro.a(adbmVar.g, hmlVar).a()) != null) {
                j = (r0[0] << 32) | (r0[1] & 4294967295L);
            } else {
                j = 0;
            }
            final MiniConversationDetailsPageViewModel miniConversationDetailsPageViewModel = (MiniConversationDetailsPageViewModel) adbmVar.h.a();
            Optional optional = miniConversationDetailsPageViewModel.a;
            final fdap fdapVar = new fdap() { // from class: adbo
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    fdvc fdvcVarA = ((cwec) obj3).a(new cwdf(2));
                    cwdc cwdcVar = (cwdc) fdct.b(miniConversationDetailsPageViewModel.b);
                    if (cwdcVar != null) {
                        cwdcVar.a(null, j, 2);
                    }
                    return fdvcVarA;
                }
            };
            Object objOrElse = optional.map(new Function() { // from class: adbp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj3) {
                    return fdapVar.invoke(obj3);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(fdvf.a(null));
            objOrElse.getClass();
            hsf hsfVarA = hro.a((fdvc) objOrElse, hmlVar);
            fcsu fcsuVar = adbmVar.d;
            hpt hptVar = djrx.a;
            Object objB = fcsuVar.b();
            objB.getClass();
            hnj.a(hptVar.c(objB), hxe.d(-320556338, new adbf(hsfVarA, adbmVar), hmlVar), hmlVar, 56);
        }
        return fctx.a;
    }
}
