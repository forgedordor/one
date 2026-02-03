package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bypa implements bzaf {
    public static final /* synthetic */ int a = 0;
    private static final eksp c = eksp.c("BugleCms");
    private final apod d;
    private final bzad e;
    private final aurx f;
    private final fcsu g;

    public bypa(bzad bzadVar, aurx aurxVar, apod apodVar, fcsu fcsuVar) {
        this.e = bzadVar;
        this.f = aurxVar;
        this.d = apodVar;
        this.g = fcsuVar;
    }

    @Override // defpackage.bzaf
    public final List a() {
        ekgb ekgbVar;
        ArrayList arrayList = new ArrayList();
        bzad bzadVar = this.e;
        bbml bbmlVar = bbml.INSERT;
        arrayList.add(bzadVar.a(2, bbmlVar, bzas.a(17)).a());
        ((eksl) ((eksl) c.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationTriggers", "getCreateTriggersSqls", 61, "CmsConversationTriggers.java")).q("Creating trigger SQL for delete conversation");
        bbml bbmlVar2 = bbml.DELETE;
        bbmm bbmmVarE = bzadVar.e(2, bbmlVar2, bzas.a(9), true);
        bbmmVarE.i = "cms_id";
        arrayList.add(bbmmVarE.a());
        bbml bbmlVar3 = bbml.UPDATE;
        bbmm bbmmVarA = bzadVar.a(2, bbmlVar3, bzas.a(3));
        bbmmVarA.d = ekjz.c("snippet_text", "sort_timestamp", "archive_status");
        bbmmVarA.a = bzas.b(3);
        arrayList.add(bbmmVarA.a());
        bbmm bbmmVarA2 = bzadVar.a(2, bbmlVar3, bzas.a(5));
        bbmmVarA2.d = ekjz.c("name", "icon", "current_self_id", "participant_id_list", "join_state", "conv_type", "send_mode", "marked_as_unread");
        bbmmVarA2.a = bzas.b(5);
        arrayList.add(bbmmVarA2.a());
        if (this.f.aj()) {
            bbmm bbmmVarA3 = bzadVar.b(6, bbmlVar).a(2, "conversation_id");
            bbmmVarA3.f = 2;
            bbmmVarA3.g = bzas.a(5);
            arrayList.add(bbmmVarA3.a());
            bbmm bbmmVarA4 = bzadVar.b(6, bbmlVar2).a(2, "conversation_id");
            bbmmVarA4.f = 2;
            bbmmVarA4.g = bzas.a(5);
            arrayList.add(bbmmVarA4.a());
        } else {
            bbmm bbmmVar = new bbmm();
            bbmmVar.c = bbmlVar;
            bbmmVar.e = 32;
            bbmmVar.b = 6;
            bbmmVar.f = 2;
            bbmmVar.i = "conversation_id";
            bbmmVar.c();
            apod apodVar = this.d;
            bbmmVar.h = apodVar.a();
            bbmmVar.g = bzas.a(5);
            arrayList.add(bbmmVar.a());
            bbmm bbmmVar2 = new bbmm();
            bbmmVar2.c = bbmlVar2;
            bbmmVar2.e = 32;
            bbmmVar2.b = 6;
            bbmmVar2.f = 2;
            bbmmVar2.i = "conversation_id";
            bbmmVar2.c();
            bbmmVar2.h = apodVar.a();
            bbmmVar2.g = bzas.a(5);
            arrayList.add(bbmmVar2.a());
        }
        if (cpyl.a()) {
            fcsu fcsuVar = this.g;
            if (((Optional) fcsuVar.b()).isPresent()) {
                Stream streamFlatMap = Collection.EL.stream(((Map) ((Optional) fcsuVar.b()).get()).values()).flatMap(new Function() { // from class: byoy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i = bypa.a;
                        return Collection.EL.stream(((cpvt) obj).b());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                ekgbVar = (ekgb) streamFlatMap.collect(ekcv.a);
            } else {
                int i2 = ekgb.d;
                ekgbVar = ekoe.a;
            }
            arrayList.addAll(ekgbVar);
        }
        return arrayList;
    }

    @Override // defpackage.bzaf
    public final List b() {
        ekgb ekgbVar;
        ArrayList arrayList = new ArrayList();
        bbml bbmlVar = bbml.INSERT;
        bzad bzadVar = this.e;
        arrayList.add(bzadVar.c(2, bbmlVar));
        bbml bbmlVar2 = bbml.DELETE;
        arrayList.add(bzadVar.c(2, bbmlVar2));
        arrayList.add(bzadVar.f(3));
        arrayList.add(bzadVar.f(5));
        arrayList.add(bzadVar.f(9));
        arrayList.add(bzadVar.c(6, bbmlVar));
        arrayList.add(bzadVar.c(6, bbmlVar2));
        fcsu fcsuVar = this.g;
        if (((Optional) fcsuVar.b()).isPresent()) {
            Stream streamFlatMap = Collection.EL.stream(((Map) ((Optional) fcsuVar.b()).get()).values()).flatMap(new Function() { // from class: byoz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = bypa.a;
                    return Collection.EL.stream(((cpvt) obj).c());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            ekgbVar = (ekgb) streamFlatMap.collect(ekcv.a);
        } else {
            int i2 = ekgb.d;
            ekgbVar = ekoe.a;
        }
        arrayList.addAll(ekgbVar);
        return arrayList;
    }
}
