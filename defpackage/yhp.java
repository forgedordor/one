package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yhp extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ boolean c;
    final /* synthetic */ yhw d;
    final /* synthetic */ zrc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhp(yhw yhwVar, zrc zrcVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = yhwVar;
        this.e = zrcVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        yhp yhpVar = new yhp(this.d, this.e, (fcxy) obj4);
        yhpVar.a = (ekgb) obj;
        yhpVar.b = zBooleanValue;
        yhpVar.c = zBooleanValue2;
        return yhpVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List list;
        fctl.b(obj);
        ?? r7 = this.a;
        boolean z = this.b;
        if (this.c) {
            ekrw ekrwVarE = yhw.a.e();
            ekrwVarE.X(eksq.a, "FooterUiAdapterImpl");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl$suggestionListUiDataFlow$8", "invokeSuspend", 271, "MessageListFooterUiAdapterImpl.kt")).q("Suggestions are suppressed because of penpal alert card");
            list = fcvo.a;
        } else if (z) {
            ekrw ekrwVarE2 = yhw.a.e();
            ekrwVarE2.X(eksq.a, "FooterUiAdapterImpl");
            ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl$suggestionListUiDataFlow$8", "invokeSuspend", 274, "MessageListFooterUiAdapterImpl.kt")).q("Suggestions are suppressed because of attachments");
            list = fcvo.a;
        } else {
            zrc zrcVar = this.e;
            ArrayList arrayList = new ArrayList();
            for (aldp aldpVar : r7) {
                aldpVar.getClass();
                dlfg dlfgVarA = zrcVar.a(aldpVar);
                if (dlfgVarA != null) {
                    arrayList.add(dlfgVarA);
                }
            }
            list = arrayList;
        }
        return new dldx(list, this.d.k);
    }
}
