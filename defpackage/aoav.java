package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoav extends fcyz implements fdat {
    final /* synthetic */ aoax a;
    final /* synthetic */ ekgb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoav(aoax aoaxVar, ekgb ekgbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aoaxVar;
        this.b = ekgbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aoav) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        aoax aoaxVar;
        fctl.b(obj);
        ekrg ekrgVar = aoax.a;
        ekrw ekrwVarE = ekrgVar.e();
        ekrz ekrzVar = eksq.a;
        ekrwVarE.X(ekrzVar, "BugleRecipientSync");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactSyncListenerImpl$onRecipientsChangedFromContacts$1", "invokeSuspend", 46, "RecipientContactSyncListenerImpl.kt")).q("Starting onRecipientsChangedFromContacts");
        ekgb ekgbVar = this.b;
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        Iterator<E> it = ekgbVar.iterator();
        while (true) {
            aoaxVar = this.a;
            if (!it.hasNext()) {
                break;
            }
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            ((axjv) aoaxVar.d.b()).b(bindData.R(), bindData);
            arrayList.add(fctx.a);
        }
        bakt baktVar = (bakt) aoaxVar.e.b();
        ArrayList arrayList2 = new ArrayList(fcva.p(ekgbVar, 10));
        Iterator<E> it2 = ekgbVar.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ParticipantsTable.BindData) it2.next()).R());
        }
        baktVar.S(new ArrayList(arrayList2));
        ekrw ekrwVarE2 = ekrgVar.e();
        ekrwVarE2.X(ekrzVar, "BugleRecipientSync");
        ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactSyncListenerImpl$onRecipientsChangedFromContacts$1", "invokeSuspend", 49, "RecipientContactSyncListenerImpl.kt")).q("Finished onRecipientsChangedFromContacts");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aoav(this.a, this.b, fcxyVar);
    }
}
