package com.google.android.ims.jibe.service.contactsmanager;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.ims.rcsservice.contacts.IContactsManagement;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import defpackage.dgxb;
import defpackage.dgxd;
import defpackage.dhff;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ContactsManager extends IContactsManagement.Stub {
    private final Context a;
    private final dgxb b;

    public ContactsManager(Context context, dgxb dgxbVar) {
        this.a = context;
        this.b = dgxbVar;
    }

    @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
    public ContactsServiceResult forceRefreshCapabilities(String str) throws RemoteException {
        dhff.d(this.a, Binder.getCallingUid());
        return this.b.a(str);
    }

    @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
    public ImsCapabilities getCachedCapabilities(String str) throws RemoteException {
        dhff.d(this.a, Binder.getCallingUid());
        return dgxd.a(this.b.c(str));
    }

    @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
    public ContactsServiceResult refreshCapabilities(String str) throws RemoteException {
        dhff.d(this.a, Binder.getCallingUid());
        return this.b.b(str, 0);
    }
}
