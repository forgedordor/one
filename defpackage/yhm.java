package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yhm extends fcyz implements fdax {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ boolean e;
    final /* synthetic */ yhw f;
    final /* synthetic */ zrc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhm(yhw yhwVar, zrc zrcVar, fcxy fcxyVar) {
        super(6, fcxyVar);
        this.f = yhwVar;
        this.g = zrcVar;
    }

    @Override // defpackage.fdax
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        yhm yhmVar = new yhm(this.f, this.g, (fcxy) obj6);
        yhmVar.a = (ekgb) obj;
        yhmVar.b = zBooleanValue;
        yhmVar.c = (ekgb) obj3;
        yhmVar.d = (dpzj) obj4;
        yhmVar.e = zBooleanValue2;
        return yhmVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List listAe;
        fctl.b(obj);
        ?? r11 = this.a;
        boolean z = this.b;
        ?? r1 = this.c;
        Object obj2 = this.d;
        if (this.e) {
            ekrw ekrwVarE = yhw.a.e();
            ekrwVarE.X(eksq.a, "FooterUiAdapterImpl");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl$suggestionListUiDataFlow$2", "invokeSuspend", 155, "MessageListFooterUiAdapterImpl.kt")).q("Suggestions are suppressed because of penpal alert card");
            listAe = fcvo.a;
        } else if (z) {
            ekrw ekrwVarE2 = yhw.a.e();
            ekrwVarE2.X(eksq.a, "FooterUiAdapterImpl");
            ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl$suggestionListUiDataFlow$2", "invokeSuspend", 158, "MessageListFooterUiAdapterImpl.kt")).q("Suggestions are suppressed because of attachments");
            listAe = fcvo.a;
        } else {
            ArrayList arrayList = new ArrayList();
            if (!((Boolean) crbf.bn.e()).booleanValue() || !r11.isEmpty() || (obj2 instanceof dpzi)) {
                zrc zrcVar = this.g;
                ArrayList arrayList2 = new ArrayList(fcva.p((Iterable) r1, 10));
                for (alff alffVar : r1) {
                    alffVar.getClass();
                    arrayList2.add(zrcVar.b(alffVar));
                }
                arrayList.addAll(arrayList2);
            }
            zrc zrcVar2 = this.g;
            ArrayList arrayList3 = new ArrayList(fcva.p((Iterable) r11, 10));
            for (alff alffVar2 : r11) {
                alffVar2.getClass();
                arrayList3.add(zrcVar2.b(alffVar2));
            }
            arrayList.addAll(arrayList3);
            listAe = fcva.ae(arrayList);
            ekrw ekrwVarE3 = yhw.a.e();
            ekrwVarE3.X(eksq.a, "FooterUiAdapterImpl");
            ((ekrd) ekrwVarE3.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl$suggestionListUiDataFlow$2", "invokeSuspend", 178, "MessageListFooterUiAdapterImpl.kt")).u("suggestionListUiDataFlow: allSuggestions=%s, filteredSuggestions=%s", arrayList.size(), listAe.size());
        }
        return new dldx(listAe, this.f.k);
    }
}
