package com.google.android.gms.contactkeys.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contactkeys.ContactInfoParcelable;
import com.google.android.gms.contactkeys.E2eeContactKeyListParcelable;
import com.google.android.gms.contactkeys.E2eeSelfKeyListParcelable;
import com.google.android.gms.contactkeys.internal.IContactKeyService;
import com.google.android.gms.contactkeys.internal.IContactKeyStatusCallback;
import com.google.android.gms.contactkeys.internal.IContactKeysDataHolderCallback;
import com.google.android.gms.contactkeys.internal.ISelfKeysCallback;
import com.google.android.gms.contactkeys.internal.InternalContactKeyClient;
import defpackage.dcfa;
import defpackage.dcfe;
import defpackage.dcfl;
import defpackage.dcfm;
import defpackage.dcir;
import defpackage.dciz;
import defpackage.dcjb;
import defpackage.dcot;
import defpackage.dcov;
import defpackage.dcpa;
import defpackage.dcpj;
import defpackage.dcpl;
import defpackage.defn;
import defpackage.fcva;
import defpackage.fcwa;
import defpackage.fcwm;
import defpackage.fczl;
import defpackage.fdap;
import defpackage.fddu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalContactKeyClient extends dcfm implements dcov {
    public static final String[] a = (String[]) fcwm.d("lookup", "mimetype", "data1", "data1", "data1").toArray(new String[0]);
    private final Context b;

    public InternalContactKeyClient(Context context) {
        super(context, new dcfe("ContactKey.API", dcpl.b, dcpl.a), dcfa.q, dcfl.a);
        this.b = context;
    }

    @Override // defpackage.dcov
    public final defn a() {
        dciz dcizVar = new dciz();
        dcizVar.b = new Feature[]{dcpa.a};
        dcizVar.a = new dcir() { // from class: dcpc
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                String[] strArr = InternalContactKeyClient.a;
                final defr defrVar = (defr) obj2;
                ((IContactKeyService) ((dcpb) obj).w()).getAllOwnerE2eeContactKeysWithDataHolder(new IContactKeysDataHolderCallback.Stub() { // from class: com.google.android.gms.contactkeys.internal.InternalContactKeyClient$getAllOwnerE2eeContactKeys$1$callback$1
                    @Override // com.google.android.gms.contactkeys.internal.IContactKeysDataHolderCallback
                    public void onResult(Status status, DataHolder dataHolder) {
                        status.getClass();
                        dataHolder.getClass();
                        dcjb.b(status, E2eeContactKeyListParcelable.a(dataHolder), defrVar);
                    }
                });
            }
        };
        dcizVar.c = 33922;
        return j(dcizVar.a());
    }

    @Override // defpackage.dcov
    public final defn b() {
        dciz dcizVar = new dciz();
        dcizVar.b = new Feature[]{dcpa.a};
        dcizVar.a = new dcir() { // from class: dcpd
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                String[] strArr = InternalContactKeyClient.a;
                final defr defrVar = (defr) obj2;
                ((IContactKeyService) ((dcpb) obj).w()).getOwnerE2eeSelfKeys(new ISelfKeysCallback.Stub() { // from class: com.google.android.gms.contactkeys.internal.InternalContactKeyClient$getOwnerE2eeSelfKeys$1$callback$1
                    @Override // com.google.android.gms.contactkeys.internal.ISelfKeysCallback
                    public void onResult(Status status, E2eeSelfKeyListParcelable e2eeSelfKeyListParcelable) {
                        status.getClass();
                        e2eeSelfKeyListParcelable.getClass();
                        dcjb.b(status, e2eeSelfKeyListParcelable, defrVar);
                    }
                });
            }
        };
        dcizVar.c = 33905;
        return j(dcizVar.a());
    }

    @Override // defpackage.dcov
    public final defn c(final String str, final String str2, final String str3) {
        dciz dcizVar = new dciz();
        dcizVar.b = new Feature[]{dcpa.a};
        dcizVar.a = new dcir() { // from class: dcpf
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                String[] strArr = InternalContactKeyClient.a;
                final defr defrVar = (defr) obj2;
                ((IContactKeyService) ((dcpb) obj).w()).removeE2eeContactKey(new IContactKeyStatusCallback.Stub() { // from class: com.google.android.gms.contactkeys.internal.InternalContactKeyClient$removeE2eeContactKey$1$callback$1
                    @Override // com.google.android.gms.contactkeys.internal.IContactKeyStatusCallback
                    public void onResult(Status status) {
                        status.getClass();
                        dcjb.a(status, defrVar);
                    }
                }, str, str2, str3);
            }
        };
        dcizVar.c = 33915;
        return j(dcizVar.a());
    }

    @Override // defpackage.dcov
    public final defn d(final String str, final String str2) {
        dciz dcizVar = new dciz();
        dcizVar.b = new Feature[]{dcpa.a};
        dcizVar.a = new dcir() { // from class: dcpg
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                String[] strArr = InternalContactKeyClient.a;
                final defr defrVar = (defr) obj2;
                ((IContactKeyService) ((dcpb) obj).w()).removeE2eeSelfKey(new IContactKeyStatusCallback.Stub() { // from class: com.google.android.gms.contactkeys.internal.InternalContactKeyClient$removeE2eeSelfKey$1$callback$1
                    @Override // com.google.android.gms.contactkeys.internal.IContactKeyStatusCallback
                    public void onResult(Status status) {
                        status.getClass();
                        dcjb.a(status, defrVar);
                    }
                }, str, str2);
            }
        };
        dcizVar.c = 33916;
        return j(dcizVar.a());
    }

    @Override // defpackage.dcov
    public final defn e(final String str, final String str2, final String str3, final byte[] bArr) throws IOException {
        String string;
        str.getClass();
        str3.getClass();
        bArr.getClass();
        Context context = this.b;
        List listB = fcva.b(str);
        context.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(listB, 10)), 16));
        for (Object obj : listB) {
            dcot dcotVar = new dcot();
            dcotVar.a.a = (String) obj;
            linkedHashMap.put(obj, dcotVar);
        }
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.getClass();
        Cursor cursorQuery = contentResolver.query(Uri.parse("content://com.android.contacts/data"), a, "\n            lookup IN (" + fcva.aF(listB, null, null, null, new fdap() { // from class: dcpi
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                ((String) obj2).getClass();
                return "?";
            }
        }, 31) + ") AND\n            mimetype IN (\n              'vnd.android.cursor.item/email_v2',\n              'vnd.android.cursor.item/phone_v2',\n              'vnd.android.cursor.item/name' )\n            ", (String[]) listB.toArray(new String[0]), null);
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                try {
                    dcot dcotVar2 = (dcot) linkedHashMap.get(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("lookup")));
                    if (dcotVar2 != null && (string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mimetype"))) != null) {
                        int iHashCode = string.hashCode();
                        if (iHashCode != -1569536764) {
                            if (iHashCode != -1079224304) {
                                if (iHashCode == 684173810 && string.equals("vnd.android.cursor.item/phone_v2")) {
                                    dcotVar2.a.c = dcpj.a(cursorQuery);
                                }
                            } else if (string.equals("vnd.android.cursor.item/name")) {
                                dcotVar2.a.b = dcpj.a(cursorQuery);
                            }
                        } else if (string.equals("vnd.android.cursor.item/email_v2")) {
                            dcotVar2.a.d = dcpj.a(cursorQuery);
                        }
                    }
                } finally {
                }
            }
            fczl.a(cursorQuery, null);
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList = new ArrayList(fcva.p(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((dcot) it.next()).a);
        }
        final ContactInfoParcelable contactInfoParcelable = (ContactInfoParcelable) fcva.P(arrayList);
        dciz dcizVar = new dciz();
        dcizVar.b = new Feature[]{dcpa.a};
        dcizVar.a = new dcir() { // from class: dcpe
            @Override // defpackage.dcir
            public final void a(Object obj2, Object obj3) {
                String[] strArr = InternalContactKeyClient.a;
                final defr defrVar = (defr) obj3;
                IContactKeyStatusCallback.Stub stub = new IContactKeyStatusCallback.Stub() { // from class: com.google.android.gms.contactkeys.internal.InternalContactKeyClient$updateOrInsertE2eeContactKey$2$callback$1
                    @Override // com.google.android.gms.contactkeys.internal.IContactKeyStatusCallback
                    public void onResult(Status status) {
                        status.getClass();
                        dcjb.a(status, defrVar);
                    }
                };
                IContactKeyService iContactKeyService = (IContactKeyService) ((dcpb) obj2).w();
                ContactInfoParcelable contactInfoParcelable2 = contactInfoParcelable;
                String str4 = contactInfoParcelable2 != null ? contactInfoParcelable2.d : null;
                String str5 = contactInfoParcelable2 != null ? contactInfoParcelable2.b : null;
                String str6 = contactInfoParcelable2 != null ? contactInfoParcelable2.c : null;
                byte[] bArr2 = bArr;
                String str7 = str3;
                iContactKeyService.updateOrInsertE2eeContactKey(stub, str, str2, str7, bArr2, str4, str5, str6);
            }
        };
        dcizVar.c = 33907;
        return j(dcizVar.a());
    }

    @Override // defpackage.dcov
    public final defn f(final String str, final String str2, final byte[] bArr) {
        bArr.getClass();
        dciz dcizVar = new dciz();
        dcizVar.b = new Feature[]{dcpa.a};
        dcizVar.a = new dcir() { // from class: dcph
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                String[] strArr = InternalContactKeyClient.a;
                final defr defrVar = (defr) obj2;
                ((IContactKeyService) ((dcpb) obj).w()).updateOrInsertE2eeSelfKey(new IContactKeyStatusCallback.Stub() { // from class: com.google.android.gms.contactkeys.internal.InternalContactKeyClient$updateOrInsertE2eeSelfKey$1$callback$1
                    @Override // com.google.android.gms.contactkeys.internal.IContactKeyStatusCallback
                    public void onResult(Status status) {
                        status.getClass();
                        dcjb.a(status, defrVar);
                    }
                }, str, str2, bArr);
            }
        };
        dcizVar.c = 33908;
        return j(dcizVar.a());
    }
}
