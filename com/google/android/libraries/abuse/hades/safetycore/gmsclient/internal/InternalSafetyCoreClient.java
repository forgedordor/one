package com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IStatusCallback;
import defpackage.dcfa;
import defpackage.dcfl;
import defpackage.dcfm;
import defpackage.dcir;
import defpackage.dciz;
import defpackage.dcjb;
import defpackage.defn;
import defpackage.dhza;
import defpackage.dhzc;
import defpackage.dhzj;
import defpackage.fctx;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class InternalSafetyCoreClient extends dcfm implements dhzc {
    public InternalSafetyCoreClient(Context context) {
        super(context, dhzj.a, dcfa.q, dcfl.a);
    }

    @Override // defpackage.dhzc
    public final defn a(final int i, final ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.getClass();
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: dhzh
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                final defr defrVar = (defr) obj2;
                ((ISafetyCoreService) ((dhzk) obj).w()).classifyImageFileDescriptor(i, parcelFileDescriptor, new ISafetyCoreCallbacks.Stub() { // from class: com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.InternalSafetyCoreClient$classifyImageFileDescriptor$1$callback$1
                    @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks
                    public void onClassificationResult(Status status, dhza dhzaVar) {
                        status.getClass();
                        dcjb.b(status, dhzaVar, defrVar);
                    }
                });
            }
        };
        return j(dcizVar.a());
    }

    @Override // defpackage.dhzc
    public final defn b(final int i, final ParcelFileDescriptor parcelFileDescriptor, final int i2) {
        parcelFileDescriptor.getClass();
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: dhzg
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                final defr defrVar = (defr) obj2;
                ISafetyCoreCallbacks.Stub stub = new ISafetyCoreCallbacks.Stub() { // from class: com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.InternalSafetyCoreClient$classifyVideoFileDescriptor$1$callback$1
                    @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks
                    public void onClassificationResult(Status status, dhza dhzaVar) {
                        status.getClass();
                        dcjb.b(status, dhzaVar, defrVar);
                    }
                };
                ((ISafetyCoreService) ((dhzk) obj).w()).classifyVideoFileDescriptor(i, parcelFileDescriptor, new dhzd(Integer.valueOf(i2)), stub);
            }
        };
        return j(dcizVar.a());
    }

    @Override // defpackage.dhzc
    public final defn c(final int[] iArr) {
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: dhzf
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                final defr defrVar = (defr) obj2;
                ((ISafetyCoreService) ((dhzk) obj).w()).prewarm(iArr, new IStatusCallback.Stub() { // from class: com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.InternalSafetyCoreClient$prewarm$1$callback$1
                    @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IStatusCallback
                    public void onResult(Status status) {
                        status.getClass();
                        dcjb.b(status, fctx.a, defrVar);
                    }
                });
            }
        };
        return j(dcizVar.a());
    }
}
