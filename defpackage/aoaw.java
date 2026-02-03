package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoaw extends fcyz implements fdat {
    final /* synthetic */ aoax a;
    final /* synthetic */ ekgb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoaw(aoax aoaxVar, ekgb ekgbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aoaxVar;
        this.b = ekgbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aoaw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrg ekrgVar = aoax.a;
        ekrw ekrwVarE = ekrgVar.e();
        ekrz ekrzVar = eksq.a;
        ekrwVarE.X(ekrzVar, "BugleRecipientSync");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactSyncListenerImpl$onRecipientsUpdatedFromContacts$1", "invokeSuspend", 56, "RecipientContactSyncListenerImpl.kt")).q("Starting onRecipientsUpdatedFromContacts");
        final ekgb ekgbVar = this.b;
        aoax aoaxVar = this.a;
        if (aoaxVar.f.a()) {
            Optional optional = aoaxVar.c;
            final fdap fdapVar = new fdap() { // from class: aoar
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    fcsu fcsuVar = (fcsu) obj2;
                    fcsuVar.getClass();
                    ((csyy) fcsuVar.b()).c(ekgbVar);
                    return fctx.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: aoas
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    fdapVar.invoke(obj2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            Optional optional2 = aoaxVar.b;
            final fdap fdapVar2 = new fdap() { // from class: aoat
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    fcsu fcsuVar = (fcsu) obj2;
                    fcsuVar.getClass();
                    ((csyk) fcsuVar.b()).c(ekgbVar);
                    return fctx.a;
                }
            };
            optional2.ifPresent(new Consumer() { // from class: aoau
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    fdapVar2.invoke(obj2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        ekrw ekrwVarE2 = ekrgVar.e();
        ekrwVarE2.X(ekrzVar, "BugleRecipientSync");
        ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactSyncListenerImpl$onRecipientsUpdatedFromContacts$1", "invokeSuspend", 58, "RecipientContactSyncListenerImpl.kt")).q("Finished onRecipientsUpdatedFromContacts");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aoaw(this.a, this.b, fcxyVar);
    }
}
