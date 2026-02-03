package com.google.android.rcs.client.contacts;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.ims.rcsservice.contacts.IContactsManagement;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import defpackage.dfnv;
import defpackage.dfny;
import defpackage.dhja;
import defpackage.dhka;
import defpackage.efaj;
import defpackage.efal;
import defpackage.efao;
import defpackage.efaq;
import defpackage.ewee;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ContactsService extends efaj<IContactsManagement> {
    public static final dfny h = dfnv.b("contacts_service_connection_deprecated");

    public ContactsService(Context context, efaq efaqVar, Optional<efal> optional) {
        super(IContactsManagement.class, context, efaqVar, 1, optional);
    }

    @Override // defpackage.efaj
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    public ContactsServiceResult forceRefreshCapabilities(String str) throws efao {
        b();
        Context context = this.e;
        if (dhka.k(context) && !dhka.g(context, getRcsServiceMetaDataKey(), 2)) {
            dhja.q("CSApk version does not force refresh capabilities.", new Object[0]);
            return refreshCapabilities(str);
        }
        if (TextUtils.isEmpty(str)) {
            return new ContactsServiceResult(11, "Invalid destination");
        }
        try {
            return ((IContactsManagement) a()).forceRefreshCapabilities(str);
        } catch (Exception e) {
            throw new efao(e.getMessage(), e);
        }
    }

    public ImsCapabilities getCachedCapabilities(String str) throws efao {
        b();
        try {
            return ((IContactsManagement) a()).getCachedCapabilities(str);
        } catch (Exception e) {
            throw new efao(e.getMessage(), e);
        }
    }

    @Override // defpackage.efaj
    public String getRcsServiceMetaDataKey() {
        return "ContactsServiceVersions";
    }

    @Override // defpackage.efaj
    public ewee getServiceNameLoggingEnum() {
        return ewee.CONTACTS_SERVICE;
    }

    public ContactsServiceResult refreshCapabilities(String str) throws efao {
        b();
        if (TextUtils.isEmpty(str)) {
            return new ContactsServiceResult(11, "Invalid destination");
        }
        try {
            return ((IContactsManagement) a()).refreshCapabilities(str);
        } catch (Exception e) {
            throw new efao(e.getMessage(), e);
        }
    }
}
