package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateAttachmentAfterResizingAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.ayjt;
import defpackage.ayju;
import defpackage.bayy;
import defpackage.bvdt;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ejxr;
import defpackage.elgm;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateAttachmentAfterResizingAction extends Action<Void> implements Parcelable {
    public final Context b;
    public final bayy c;
    public final dqsn d;
    public static final cqce a = cqce.g("Bugle", "UpdateAttachmentAfterResizingAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ayjt();

    /* compiled from: PG */
    public interface a {
        ayju im();
    }

    public UpdateAttachmentAfterResizingAction(Context context, bayy bayyVar, dqsn dqsnVar, Parcel parcel) {
        super(parcel, elgm.UPDATE_ATTACHMENT_AFTER_RESIZING_ACTION);
        this.b = context;
        this.c = bayyVar;
        this.d = dqsnVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("UpdateAttachmentAfterResizingAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("UpdateAttachmentAfterResizingAction executeInScope");
        cqbdVarC.r();
        return (Void) this.d.b(new ejxr() { // from class: ayjo
            @Override // defpackage.ejxr
            public final Object get() {
                bvdt bvdtVar;
                final UpdateAttachmentAfterResizingAction updateAttachmentAfterResizingAction = this.a;
                aymo aymoVar = updateAttachmentAfterResizingAction.v;
                final String strL = aymoVar.l("content_uri");
                final String strL2 = aymoVar.l("output_uri");
                final String strL3 = aymoVar.l("content_type");
                int iA = aymoVar.a("processing_status");
                if (iA == 0) {
                    bvdtVar = bvdt.SUCCEEDED;
                } else if (iA == 1) {
                    bvdtVar = bvdt.FAILED;
                } else {
                    if (iA != 2) {
                        throw new IllegalArgumentException(a.g(iA, "code: "));
                    }
                    bvdtVar = bvdt.TOO_LARGE;
                }
                final bvdt bvdtVar2 = bvdtVar;
                if (((Integer) updateAttachmentAfterResizingAction.d.c("UpdateAttachmentAfterResizingAction#executeAction", new ejxr() { // from class: ayjn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        String str = strL;
                        final Uri uri = Uri.parse(strL2);
                        final Uri uri2 = Uri.parse(str);
                        String[] strArr = PartsTable.a;
                        bsjh bsjhVar = new bsjh();
                        bsjhVar.ap("UpdateAttachmentAfterResizingAction#executeAction");
                        bvdt bvdtVar3 = bvdtVar2;
                        bsjhVar.w(bvdtVar3);
                        bsjhVar.v();
                        bvdt bvdtVar4 = bvdt.SUCCEEDED;
                        if (bvdtVar3 == bvdtVar4) {
                            String str2 = strL3;
                            bsjhVar.z(uri);
                            bsjhVar.j(str2);
                        }
                        final UpdateAttachmentAfterResizingAction updateAttachmentAfterResizingAction2 = updateAttachmentAfterResizingAction;
                        bsjhVar.D(new Function() { // from class: bxmq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsjl bsjlVar = (bsjl) obj;
                                bsjlVar.r(uri);
                                bsjlVar.v(uri2);
                                return bsjlVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        if (bsjhVar.b().e() <= 0) {
                            cqbd cqbdVarD = UpdateAttachmentAfterResizingAction.a.d();
                            cqbdVarD.I("Attachment for");
                            cqbdVarD.I(str);
                            cqbdVarD.I("gone. Deleting output.");
                            cqbdVarD.r();
                            updateAttachmentAfterResizingAction2.d.g(new dqsm() { // from class: ayjp
                                @Override // defpackage.dqsm
                                public final eieu a() {
                                    cqce cqceVar = UpdateAttachmentAfterResizingAction.a;
                                    return eiiy.k("UAARA::deleteContent1::runAfterCommit");
                                }
                            }, null, new Runnable() { // from class: ayjq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bxlf.i(updateAttachmentAfterResizingAction2.b, uri);
                                }
                            });
                        } else if (bvdtVar3 == bvdtVar4) {
                            updateAttachmentAfterResizingAction2.d.g(new dqsm() { // from class: ayjr
                                @Override // defpackage.dqsm
                                public final eieu a() {
                                    cqce cqceVar = UpdateAttachmentAfterResizingAction.a;
                                    return eiiy.k("UAARA::deleteContent2::runAfterCommit");
                                }
                            }, null, new Runnable() { // from class: ayjs
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bxlf.i(updateAttachmentAfterResizingAction2.b, uri2);
                                }
                            });
                        }
                        return Integer.valueOf(updateAttachmentAfterResizingAction2.c.a());
                    }
                })).intValue() <= 0) {
                    return null;
                }
                axtl.d(6, updateAttachmentAfterResizingAction);
                return null;
            }
        });
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateAttachmentAfterResizing.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public UpdateAttachmentAfterResizingAction(Context context, bayy bayyVar, dqsn dqsnVar, String str, String str2, String str3, bvdt bvdtVar) {
        super(elgm.UPDATE_ATTACHMENT_AFTER_RESIZING_ACTION);
        this.b = context;
        this.c = bayyVar;
        this.d = dqsnVar;
        this.v.v("content_uri", str);
        this.v.v("output_uri", str2);
        if (str3 != null) {
            this.v.v("content_type", str3);
        }
        this.v.r("processing_status", bvdtVar.e);
    }
}
