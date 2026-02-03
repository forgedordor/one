package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yhn extends fcyz implements fdax {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ boolean e;
    final /* synthetic */ yhw f;
    final /* synthetic */ zrc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhn(yhw yhwVar, zrc zrcVar, fcxy fcxyVar) {
        super(6, fcxyVar);
        this.f = yhwVar;
        this.g = zrcVar;
    }

    @Override // defpackage.fdax
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        yhn yhnVar = new yhn(this.f, this.g, (fcxy) obj6);
        yhnVar.a = (ekgb) obj;
        yhnVar.b = zBooleanValue;
        yhnVar.c = (ekgb) obj3;
        yhnVar.d = (dpzj) obj4;
        yhnVar.e = zBooleanValue2;
        return yhnVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List list;
        fctl.b(obj);
        ?? r9 = this.a;
        boolean z = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        if (this.e) {
            ekrw ekrwVarE = yhw.a.e();
            ekrwVarE.X(eksq.a, "FooterUiAdapterImpl");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl$suggestionListUiDataFlow$4", "invokeSuspend", 205, "MessageListFooterUiAdapterImpl.kt")).q("Suggestions are suppressed because of penpal alert card");
            list = fcvo.a;
        } else if (z) {
            ekrw ekrwVarE2 = yhw.a.e();
            ekrwVarE2.X(eksq.a, "FooterUiAdapterImpl");
            ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl$suggestionListUiDataFlow$4", "invokeSuspend", 208, "MessageListFooterUiAdapterImpl.kt")).q("Suggestions are suppressed because of attachments");
            list = fcvo.a;
        } else {
            ArrayList arrayList = new ArrayList();
            if (!((Boolean) crbf.bn.e()).booleanValue() || !r9.isEmpty() || (obj3 instanceof dpzi)) {
                arrayList.addAll(obj2);
            }
            arrayList.addAll(r9);
            zrc zrcVar = this.g;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dlfg dlfgVarA = zrcVar.a((aldp) it.next());
                if (dlfgVarA != null) {
                    arrayList2.add(dlfgVarA);
                }
            }
            ekrw ekrwVarE3 = yhw.a.e();
            ekrwVarE3.X(eksq.a, "FooterUiAdapterImpl");
            ((ekrd) ekrwVarE3.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl$suggestionListUiDataFlow$4", "invokeSuspend", 226, "MessageListFooterUiAdapterImpl.kt")).u("suggestionListUiDataFlow: allSuggestions=%s, filteredSuggestions=%s", arrayList.size(), arrayList2.size());
            list = arrayList2;
        }
        return new dldx(list, this.f.k);
    }
}
