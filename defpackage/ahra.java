package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahra implements ahqr {
    public static final /* synthetic */ int b = 0;
    private static final eksp c = eksp.c("BugleReplies");
    public final apsj a;
    private final ahrc d;
    private final cqsx e;

    public ahra(ahrc ahrcVar, cqsx cqsxVar, apsj apsjVar) {
        ahrcVar.getClass();
        cqsxVar.getClass();
        this.d = ahrcVar;
        this.e = cqsxVar;
        this.a = apsjVar;
    }

    private final ahrm c(ahrm ahrmVar) throws evtj {
        String str = ahrmVar.b == 11 ? (String) ahrmVar.c : "";
        if (str != null && str.length() != 0) {
            String str2 = ahrmVar.b == 11 ? (String) ahrmVar.c : "";
            cqsx cqsxVar = this.e;
            Uri uri = Uri.parse(str2);
            cczi ccziVar = ahqq.a;
            Object objE = ccziVar.e();
            objE.getClass();
            int iIntValue = ((Number) objE).intValue();
            Object objE2 = ccziVar.e();
            objE2.getClass();
            byte[] bArrB = cqsxVar.b(uri, iIntValue, ((Number) objE2).intValue(), ((Number) ahqq.b.e()).intValue());
            if (bArrB != null) {
                ahrd ahrdVar = (ahrd) ahre.a.createBuilder();
                ahrdVar.getClass();
                evqs evqsVarX = evqs.x(bArrB);
                ahrdVar.copyOnWrite();
                ((ahre) ahrdVar.instance).b = evqsVarX;
                long jIntValue = ((Number) ccziVar.e()).intValue();
                ahrdVar.copyOnWrite();
                ((ahre) ahrdVar.instance).c = jIntValue;
                long jIntValue2 = ((Number) ccziVar.e()).intValue();
                ahrdVar.copyOnWrite();
                ((ahre) ahrdVar.instance).d = jIntValue2;
                evsn evsnVarBuild = ahrdVar.build();
                evsnVarBuild.getClass();
                ahre ahreVar = (ahre) evsnVarBuild;
                ahrl ahrlVar = (ahrl) ahrmVar.toBuilder();
                ahrlVar.copyOnWrite();
                ahrm ahrmVar2 = (ahrm) ahrlVar.instance;
                if (ahrmVar2.b == 11) {
                    ahrmVar2.b = 0;
                    ahrmVar2.c = null;
                }
                ahrlVar.copyOnWrite();
                ahrm ahrmVar3 = (ahrm) ahrlVar.instance;
                ahrmVar3.c = ahreVar;
                ahrmVar3.b = 12;
                evsn evsnVarBuild2 = ahrlVar.build();
                evsnVarBuild2.getClass();
                return (ahrm) evsnVarBuild2;
            }
        }
        return null;
    }

    @Override // defpackage.ahqr
    public final void a(final epbb epbbVar, final baea baeaVar) {
        RepliedToDataAdapter repliedToDataAdapterA;
        ahqh ahqhVar = baeaVar.f;
        if (ahqhVar != null) {
            ecem.b();
            try {
                repliedToDataAdapterA = this.d.a(ahqhVar);
            } catch (IllegalStateException e) {
                ((eksl) ((eksl) c.i()).g(e)).q("Failed to extract replied-to data");
                repliedToDataAdapterA = null;
            }
            if (repliedToDataAdapterA != null) {
                new fdap() { // from class: ahqs
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) throws IOException {
                        ahsa ahsaVarB;
                        ahsa ahsaVar = (ahsa) obj;
                        ahsaVar.getClass();
                        ahra ahraVar = this;
                        boolean zA = ((eoth) ((aoxx) ahraVar.a).a.b()).a("bugle.enable_message_id_v2_for_replied_to_message");
                        baea baeaVar2 = baeaVar;
                        if (zA) {
                            final ahsa ahsaVarB2 = ahqz.b(ahsaVar, baeaVar2);
                            brdr brdrVarD = MessagesTable.d();
                            brdrVarD.A("setMessageIdV2ToRepliedToMessage");
                            brdrVarD.f(new Function() { // from class: ahqt
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return ((bran) obj2).C;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            brdrVarD.h(new Function() { // from class: ahqu
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    brec brecVar = (brec) obj2;
                                    brecVar.p(bary.b(ahsaVarB2.c));
                                    return brecVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            brdrVarD.y(1);
                            dqqj dqqjVarP = brdrVarD.b().p();
                            try {
                                brap brapVar = (brap) dqqjVarP;
                                if (brapVar.moveToFirst()) {
                                    ahrz ahrzVar = (ahrz) ahsaVarB2.toBuilder();
                                    epqg epqgVar = (epqg) epqh.a.createBuilder();
                                    String str = ahsaVarB2.c;
                                    epqgVar.copyOnWrite();
                                    epqh epqhVar = (epqh) epqgVar.instance;
                                    str.getClass();
                                    epqhVar.b = 1 | epqhVar.b;
                                    epqhVar.c = str;
                                    String strF = brapVar.r().f();
                                    epqgVar.copyOnWrite();
                                    epqh epqhVar2 = (epqh) epqgVar.instance;
                                    epqhVar2.b |= 2;
                                    epqhVar2.d = strF;
                                    ahrzVar.copyOnWrite();
                                    ahsa ahsaVar2 = (ahsa) ahrzVar.instance;
                                    epqh epqhVar3 = (epqh) epqgVar.build();
                                    epqhVar3.getClass();
                                    ahsaVar2.h = epqhVar3;
                                    ahsaVar2.b |= 4;
                                    evsn evsnVarBuild = ahrzVar.build();
                                    evsnVarBuild.getClass();
                                    ahsaVarB2 = (ahsa) evsnVarBuild;
                                    fczl.a(dqqjVarP, null);
                                } else {
                                    fczl.a(dqqjVarP, null);
                                }
                                ahsaVarB = ahraVar.b(ahsaVarB2);
                            } finally {
                            }
                        } else {
                            ahsaVarB = ahraVar.b(ahqz.b(ahsaVar, baeaVar2));
                        }
                        epbb epbbVar2 = epbbVar;
                        epbbVar2.copyOnWrite();
                        epbl epblVar = (epbl) epbbVar2.instance;
                        epbl epblVar2 = epbl.a;
                        epblVar.t = ahsaVarB;
                        epblVar.b |= 64;
                        return fctx.a;
                    }
                }.invoke(repliedToDataAdapterA.a);
            }
        }
    }

    public final ahsa b(ahsa ahsaVar) throws evtj {
        ahrg ahrgVar = ahsaVar.e;
        if (ahrgVar == null) {
            ahrgVar = ahrg.a;
        }
        ahrv ahrvVar = ahrgVar.e;
        if (ahrvVar == null) {
            ahrvVar = ahrv.a;
        }
        if (ahrvVar.b != 2) {
            return ahsaVar;
        }
        ahrg ahrgVar2 = ahsaVar.e;
        if (ahrgVar2 == null) {
            ahrgVar2 = ahrg.a;
        }
        ahrv ahrvVar2 = ahrgVar2.e;
        if (ahrvVar2 == null) {
            ahrvVar2 = ahrv.a;
        }
        ahrm ahrmVar = ahrvVar2.b == 2 ? (ahrm) ahrvVar2.c : ahrm.a;
        ahrmVar.getClass();
        String str = ahrmVar.d;
        str.getClass();
        ahrm ahrmVarC = (le.m(str) || le.z(str) || le.y(str)) ? c(ahrmVar) : null;
        if (ahrmVarC == null) {
            return ahsaVar;
        }
        evsf builder = ahsaVar.toBuilder();
        builder.getClass();
        ahrz ahrzVar = (ahrz) builder;
        ahrg ahrgVar3 = ahsaVar.e;
        if (ahrgVar3 == null) {
            ahrgVar3 = ahrg.a;
        }
        evsf builder2 = ahrgVar3.toBuilder();
        builder2.getClass();
        ahrf ahrfVar = (ahrf) builder2;
        ahrg ahrgVar4 = ahsaVar.e;
        if (ahrgVar4 == null) {
            ahrgVar4 = ahrg.a;
        }
        ahrv ahrvVar3 = ahrgVar4.e;
        if (ahrvVar3 == null) {
            ahrvVar3 = ahrv.a;
        }
        evsf builder3 = ahrvVar3.toBuilder();
        builder3.getClass();
        ahru ahruVar = (ahru) builder3;
        ahruVar.copyOnWrite();
        ahrv ahrvVar4 = (ahrv) ahruVar.instance;
        ahrvVar4.c = ahrmVarC;
        ahrvVar4.b = 2;
        ahrfVar.copyOnWrite();
        ahrg ahrgVar5 = (ahrg) ahrfVar.instance;
        ahrv ahrvVar5 = (ahrv) ahruVar.build();
        ahrvVar5.getClass();
        ahrgVar5.e = ahrvVar5;
        ahrgVar5.b |= 4;
        ahrzVar.copyOnWrite();
        ahsa ahsaVar2 = (ahsa) ahrzVar.instance;
        ahrg ahrgVar6 = (ahrg) ahrfVar.build();
        ahrgVar6.getClass();
        ahsaVar2.e = ahrgVar6;
        ahsaVar2.b |= 1;
        evsn evsnVarBuild = ahrzVar.build();
        evsnVarBuild.getClass();
        return (ahsa) evsnVarBuild;
    }
}
