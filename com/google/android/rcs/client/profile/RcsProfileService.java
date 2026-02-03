package com.google.android.rcs.client.profile;

import android.content.Context;
import com.google.android.ims.rcsservice.profile.IRcsProfile;
import defpackage.cdag;
import defpackage.crse;
import defpackage.dfnv;
import defpackage.dfny;
import defpackage.dfog;
import defpackage.dgiq;
import defpackage.efaj;
import defpackage.efaq;
import defpackage.eieu;
import defpackage.eiiy;
import j$.util.Optional;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public class RcsProfileService extends efaj<IRcsProfile> {
    public static final dfny h;
    private final crse i;

    static {
        cdag.q(185392834, "convert_null_msisdn_to_empty_string");
        h = dfnv.b("rcs_profile_service_connection_deprecated");
    }

    public RcsProfileService(Context context, efaq efaqVar, crse crseVar) {
        super(IRcsProfile.class, context, efaqVar, 1, Optional.empty());
        this.i = crseVar;
    }

    @Override // defpackage.efaj
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    public int getDefaultSharingMethod() {
        return this.i.a();
    }

    @Deprecated
    public int getGroupChatMaximumMessageSize() {
        return this.i.b();
    }

    @Deprecated
    public int getMaxGroupSize() {
        return this.i.c();
    }

    @Deprecated
    public String getMsisdn() {
        eieu eieuVarK = eiiy.k("RcsProfileService::getMsisdn");
        try {
            String strF = this.i.f();
            eieuVarK.close();
            return strF;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public int getOne2OneChatMaximumMessageSize() {
        return this.i.d();
    }

    @Deprecated
    public dgiq getRcsConfig() {
        return (dgiq) this.i.e().orElse(null);
    }

    @Deprecated
    public String getRcsConfigAcsUrl() {
        return this.i.g();
    }

    @Override // defpackage.efaj
    public String getRcsServiceMetaDataKey() {
        return "ProfileServiceVersions";
    }

    @Override // defpackage.efaj
    public boolean isConnected() {
        if (((Boolean) dfog.o().a.aB.a()).booleanValue()) {
            return true;
        }
        return super.isConnected();
    }
}
