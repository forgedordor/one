package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avgc implements avdr {
    public final Executor d;
    public final egxv e;
    public final fcsu f;
    public final fcsu g;
    private final Context m;
    private final fcyh n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    public static final String[] a = {"_id", "contact_id", "lookup", "sort_key", "phonebook_label", "phonebook_bucket", "display_name", "name_raw_contact_id", "data1", "data4", "data2", "data3", "photo_uri", "photo_thumb_uri", "photo_file_id", "contact_last_updated_timestamp"};
    private static final String[] h = {"data_id", "contact_id", "lookup", "sort_key", "display_name", "number", "normalized_number", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, "photo_uri", "photo_thumb_uri", "photo_file_id"};
    public static final String[] b = {"_id", "contact_id", "lookup", "sort_key", "phonebook_label", "phonebook_bucket", "display_name", "name_raw_contact_id", "data1", "data4", "data2", "data3", "photo_uri", "photo_thumb_uri", "contact_last_updated_timestamp"};
    public static final String[] c = {"_id", "contact_id", "lookup", "sort_key", "phonebook_label", "phonebook_bucket", "data4", "name_raw_contact_id", "data1", "data2", "data3", "photo_uri", "photo_thumb_uri", "photo_file_id", "contact_last_updated_timestamp"};
    private static final String[] i = {"contact_id", "data1", "data2", "data3"};
    private static final String[] j = {"contact_id", "data2", "data1"};
    private static final String[] k = {"_id", "contact_id", "mimetype"};
    private static final List l = fcva.b(avgg.a.b);

    public avgc(Context context, fcyh fcyhVar, fcsu fcsuVar, fcsu fcsuVar2, Executor executor, egxv egxvVar, @apqh fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        context.getClass();
        fcyhVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        executor.getClass();
        egxvVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar6.getClass();
        this.m = context;
        this.n = fcyhVar;
        this.o = fcsuVar;
        this.p = fcsuVar2;
        this.d = executor;
        this.e = egxvVar;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.q = fcsuVar5;
        this.r = fcsuVar6;
    }

    public static final ehvv C(avef avefVar) {
        ehvw ehvwVarH = H();
        J(ehvwVarH, avefVar);
        return ehvwVarH.a();
    }

    public static final ehvv D(List list, avef avefVar) {
        ehvw ehvwVarH = H();
        I(ehvwVarH, "contact_id", list);
        ehvwVarH.b(" AND ");
        J(ehvwVarH, avefVar);
        return ehvwVarH.a();
    }

    public static final ehvv E(Instant instant, avef avefVar) {
        ehvw ehvwVarH = H();
        ehvwVarH.b("contact_last_updated_timestamp > ? AND ");
        J(ehvwVarH, avefVar);
        ehvwVarH.c(String.valueOf(instant.toEpochMilli()));
        return ehvwVarH.a();
    }

    public static final ehvv F(List list, avef avefVar) {
        ehvw ehvwVarH = H();
        I(ehvwVarH, "_id", list);
        ehvwVarH.b(" AND ");
        J(ehvwVarH, avefVar);
        return ehvwVarH.a();
    }

    private final Uri G(avej avejVar, Uri uri) {
        Integer num = avejVar.p;
        Uri uriBuild = uri.buildUpon().appendQueryParameter("am_photo_id", (num == null || ContactsContract.Contacts.isEnterpriseContactId(avejVar.b)) ? String.valueOf(((cogw) this.q.b()).f().toEpochMilli()) : num.toString()).build();
        uriBuild.getClass();
        return uriBuild;
    }

    private static final ehvw H() {
        ehvw ehvwVar = new ehvw();
        ehvwVar.b("(account_type NOT IN ('com.whatsapp', 'com.google.android.apps.tachyon', 'org.thoughtcrime.securesms') OR ");
        ehvwVar.b("account_type IS NULL) AND ");
        return ehvwVar;
    }

    private static final void I(ehvw ehvwVar, String str, List list) {
        int i2 = 0;
        if (list.size() == 1) {
            ehvwVar.b(str);
            ehvwVar.b(" = ?");
            ehvwVar.c(list.get(0).toString());
            return;
        }
        ehvwVar.b(str);
        ehvwVar.b(" IN (");
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                fcva.m();
            }
            ehvwVar.b("?");
            if (i2 < list.size() - 1) {
                ehvwVar.b(",");
            }
            ehvwVar.c(obj.toString());
            i2 = i3;
        }
        ehvwVar.b(")");
    }

    private static final void J(ehvw ehvwVar, avef avefVar) {
        int iOrdinal = avefVar.ordinal();
        if (iOrdinal == 0) {
            ehvwVar.b("data1 IS NOT NULL");
        } else {
            if (iOrdinal != 1) {
                throw new fctg();
            }
            ehvwVar.b("data1 IS NOT NULL");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(defpackage.ehvv r10, final defpackage.avef r11, defpackage.fcxy r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.avga
            if (r0 == 0) goto L13
            r0 = r12
            avga r0 = (defpackage.avga) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avga r0 = new avga
            r0.<init>(r9, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            eieu r10 = r6.d
            defpackage.fctl.b(r12)     // Catch: java.lang.Throwable -> L2b
            goto L7b
        L2b:
            r0 = move-exception
            r11 = r0
            goto L84
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            defpackage.fctl.b(r12)
            java.lang.String r12 = "Cp2DataService#queryRawContacts"
            eieu r12 = defpackage.eiiy.a(r12)
            int r1 = r11.ordinal()     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L4e
            if (r1 != r2) goto L4d
            android.net.Uri r1 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI     // Catch: java.lang.Throwable -> L80
            r1.getClass()     // Catch: java.lang.Throwable -> L80
            goto L53
        L4d:
            throw r7     // Catch: java.lang.Throwable -> L80
        L4e:
            android.net.Uri r1 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch: java.lang.Throwable -> L80
            r1.getClass()     // Catch: java.lang.Throwable -> L80
        L53:
            fcsu r3 = r9.g     // Catch: java.lang.Throwable -> L80
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L80
            r3.getClass()     // Catch: java.lang.Throwable -> L80
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L80
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L80
            java.lang.String[] r3 = r11.b(r3)     // Catch: java.lang.Throwable -> L80
            avdy r5 = new avdy     // Catch: java.lang.Throwable -> L80
            r5.<init>()     // Catch: java.lang.Throwable -> L80
            r6.d = r12     // Catch: java.lang.Throwable -> L80
            r6.c = r2     // Catch: java.lang.Throwable -> L80
            r4 = r10
            r2 = r1
            r1 = r9
            java.lang.Object r10 = r1.z(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L80
            if (r10 == r0) goto L7f
            r8 = r12
            r12 = r10
            r10 = r8
        L7b:
            defpackage.fczl.a(r10, r7)
            return r12
        L7f:
            return r0
        L80:
            r0 = move-exception
            r10 = r0
            r11 = r10
            r10 = r12
        L84:
            throw r11     // Catch: java.lang.Throwable -> L85
        L85:
            r0 = move-exception
            r12 = r0
            defpackage.fczl.a(r10, r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avgc.A(ehvv, avef, fcxy):java.lang.Object");
    }

    public final List B(List list, Map map, Map map2, ekhe ekheVar) {
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            avej avejVar = (avej) it.next();
            Long lValueOf = Long.valueOf(avejVar.b);
            avel avelVar = (avel) map.get(lValueOf);
            avek avekVar = (avek) map2.get(lValueOf);
            ekfn ekfnVarC = ekheVar.c(lValueOf);
            ekfnVarC.getClass();
            arrayList.add(q(avejVar, avelVar, avekVar, ekfnVarC));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.avdr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.aven
            if (r0 == 0) goto L13
            r0 = r9
            aven r0 = (defpackage.aven) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aven r0 = new aven
            r0.<init>(r8, r9)
        L18:
            r6 = r0
            java.lang.Object r9 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r7 = 1
            if (r1 == 0) goto L36
            if (r1 != r7) goto L2e
            eieu r1 = r6.d
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2a
            goto L71
        L2a:
            r0 = move-exception
        L2b:
            r9 = r0
            goto Laa
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            defpackage.fctl.b(r9)
            fcyh r9 = r6.u()
            boolean r9 = defpackage.eicg.b(r9)
            if (r9 == 0) goto Lb0
            java.lang.String r9 = "Cp2DataService#hasManagedProfileContactDirectory"
            eieu r9 = defpackage.eiiy.h(r9)
            android.net.Uri r2 = defpackage.aky$$ExternalSyntheticApiModelOutline0.m164m()     // Catch: java.lang.Throwable -> La7
            r2.getClass()     // Catch: java.lang.Throwable -> La7
            java.lang.String r1 = "_id"
            java.lang.String[] r3 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> La7
            ehvw r1 = new ehvw     // Catch: java.lang.Throwable -> La7
            r1.<init>()     // Catch: java.lang.Throwable -> La7
            ehvv r4 = r1.a()     // Catch: java.lang.Throwable -> La7
            avds r5 = new avds     // Catch: java.lang.Throwable -> La7
            r5.<init>()     // Catch: java.lang.Throwable -> La7
            r6.d = r9     // Catch: java.lang.Throwable -> La7
            r6.c = r7     // Catch: java.lang.Throwable -> La7
            r1 = r8
            java.lang.Object r2 = r1.z(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La7
            if (r2 == r0) goto La6
            r1 = r9
            r9 = r2
        L71:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r9 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            if (r0 == 0) goto L83
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L83
        L81:
            r7 = r2
            goto L9d
        L83:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L2a
        L87:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L81
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L2a
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L2a
            long r3 = r0.longValue()     // Catch: java.lang.Throwable -> L2a
            boolean r0 = defpackage.aky$$ExternalSyntheticApiModelOutline0.m(r3)     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L87
        L9d:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            defpackage.fczl.a(r1, r0)
            return r9
        La6:
            return r0
        La7:
            r0 = move-exception
            r1 = r9
            goto L2b
        Laa:
            throw r9     // Catch: java.lang.Throwable -> Lab
        Lab:
            r0 = move-exception
            defpackage.fczl.a(r1, r9)
            throw r0
        Lb0:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avgc.a(fcxy):java.lang.Object");
    }

    @Override // defpackage.avdr
    public final Object b(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.n), new aveo(null, this), fcxyVar);
    }

    @Override // defpackage.avdr
    public final Object c(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.n), new avep(null, this), fcxyVar);
    }

    @Override // defpackage.avdr
    public final Object d(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.n), new aves(null, this), fcxyVar);
    }

    @Override // defpackage.avdr
    public final Object e(Instant instant, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.n), new avew(null, this, instant), fcxyVar);
    }

    @Override // defpackage.avdr
    public final Object f(Instant instant, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.n), new avex(null, instant, this), fcxyVar);
    }

    @Override // defpackage.avdr
    public final Object g(Instant instant, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.n), new avez(null, instant, this), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.avdr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(j$.time.Instant r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.avfb
            if (r0 == 0) goto L13
            r0 = r12
            avfb r0 = (defpackage.avfb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avfb r0 = new avfb
            r0.<init>(r10, r12)
        L18:
            r7 = r0
            java.lang.Object r12 = r7.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.c
            r8 = 0
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            eieu r11 = r7.d
            defpackage.fctl.b(r12)     // Catch: java.lang.Throwable -> L2b
            goto L8c
        L2b:
            r0 = move-exception
            r12 = r0
            goto L98
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            defpackage.fctl.b(r12)
            fcyh r12 = r7.u()
            boolean r12 = defpackage.eicg.b(r12)
            if (r12 == 0) goto L9e
            java.lang.String r12 = "Cp2DataService#queryChangedEnterpriseContacts"
            eieu r12 = defpackage.eiiy.h(r12)
            avef r1 = defpackage.avef.a     // Catch: java.lang.Throwable -> L93
            int r3 = r1.ordinal()     // Catch: java.lang.Throwable -> L93
            if (r3 == 0) goto L56
            if (r3 == r2) goto L55
            throw r8     // Catch: java.lang.Throwable -> L93
        L55:
            throw r8     // Catch: java.lang.Throwable -> L93
        L56:
            r3 = r2
            android.net.Uri r2 = defpackage.aao$$ExternalSyntheticApiModelOutline0.m$1()     // Catch: java.lang.Throwable -> L93
            r2.getClass()     // Catch: java.lang.Throwable -> L93
            fcsu r4 = r10.g     // Catch: java.lang.Throwable -> L93
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L93
            r4.getClass()     // Catch: java.lang.Throwable -> L93
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L93
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r4 = r1.b(r4)     // Catch: java.lang.Throwable -> L93
            ehvv r11 = E(r11, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.String r5 = "contact_id ASC"
            avdx r6 = new avdx     // Catch: java.lang.Throwable -> L93
            r6.<init>()     // Catch: java.lang.Throwable -> L93
            r7.d = r12     // Catch: java.lang.Throwable -> L93
            r7.c = r3     // Catch: java.lang.Throwable -> L93
            r1 = r10
            r3 = r4
            r4 = r11
            java.lang.Object r11 = r1.s(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L93
            if (r11 == r0) goto L92
            r9 = r12
            r12 = r11
            r11 = r9
        L8c:
            aveg r12 = (defpackage.aveg) r12     // Catch: java.lang.Throwable -> L2b
            defpackage.fczl.a(r11, r8)
            return r12
        L92:
            return r0
        L93:
            r0 = move-exception
            r11 = r0
            r9 = r12
            r12 = r11
            r11 = r9
        L98:
            throw r12     // Catch: java.lang.Throwable -> L99
        L99:
            r0 = move-exception
            defpackage.fczl.a(r11, r12)
            throw r0
        L9e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avgc.h(j$.time.Instant, fcxy):java.lang.Object");
    }

    @Override // defpackage.avdr
    public final Object i(List list, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.n), new avff(null, list, this), fcxyVar);
    }

    @Override // defpackage.avdr
    public final Object j(List list, fcxy fcxyVar) {
        Object objB = this.p.b();
        objB.getClass();
        return fdin.a(eicg.a((fcyh) objB), new avfi(null, list, this), fcxyVar);
    }

    @Override // defpackage.avdr
    public final Object k(List list, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.n), new avfk(null, this, list), fcxyVar);
    }

    @Override // defpackage.avdr
    public final Object l(Instant instant, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.n), new avfr(null, instant, this), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.avdr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(j$.time.Instant r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.avfu
            if (r0 == 0) goto L13
            r0 = r7
            avfu r0 = (defpackage.avfu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avfu r0 = new avfu
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fcyh r7 = r5.n
            fcyh r7 = defpackage.eicg.a(r7)
            avft r2 = new avft
            r4 = 0
            r2.<init>(r4, r6, r5)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avgc.m(j$.time.Instant, fcxy):java.lang.Object");
    }

    @Override // defpackage.avdr
    public final Object n(Instant instant, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.n), new avfw(null, instant, this), fcxyVar);
    }

    @Override // defpackage.avdr
    public final Object o(List list, fcxy fcxyVar) {
        return eicj.a(this.n, new avfy(this, list, null), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7 A[Catch: all -> 0x00e5, TRY_LEAVE, TryCatch #1 {all -> 0x00e5, blocks: (B:30:0x00bc, B:32:0x00c2, B:33:0x00c7, B:35:0x00cd, B:36:0x00d0, B:39:0x00d7), top: B:58:0x00bc, outer: #0 }] */
    @Override // defpackage.avdr
    @defpackage.fcsv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List p(defpackage.alqm r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avgc.p(alqm):java.util.List");
    }

    public final avdp q(avej avejVar, avel avelVar, avek avekVar, ekfn ekfnVar) {
        Uri uriG;
        Uri uri;
        Uri uriG2;
        Uri uri2;
        Uri uri3;
        Uri uri4;
        String str = avelVar != null ? avelVar.b : avejVar.g;
        String str2 = avejVar.d;
        String str3 = avejVar.e;
        long j2 = avejVar.f;
        String str4 = avelVar != null ? avelVar.c : null;
        String str5 = avelVar != null ? avelVar.d : null;
        String str6 = avejVar.i;
        String str7 = avejVar.j;
        String str8 = avejVar.k;
        int i2 = avejVar.l;
        String str9 = avejVar.m;
        fcsu fcsuVar = this.r;
        if (((aqis) fcsuVar.b()).a()) {
            String str10 = avejVar.n;
            if (str10 != null && (uri4 = Uri.parse(str10)) != null) {
                uriG = G(avejVar, uri4);
                uri = uriG;
            }
            uri = null;
        } else {
            String str11 = avejVar.n;
            if (str11 != null) {
                uriG = Uri.parse(str11);
                uri = uriG;
            }
            uri = null;
        }
        if (((aqis) fcsuVar.b()).a()) {
            String str12 = avejVar.o;
            if (str12 != null && (uri3 = Uri.parse(str12)) != null) {
                uriG2 = G(avejVar, uri3);
                uri2 = uriG2;
            }
            uri2 = null;
        } else {
            String str13 = avejVar.o;
            if (str13 != null) {
                uriG2 = Uri.parse(str13);
                uri2 = uriG2;
            }
            uri2 = null;
        }
        Integer num = avejVar.p;
        String str14 = avekVar != null ? avekVar.a : null;
        String str15 = avekVar != null ? avekVar.b : null;
        String str16 = avejVar.c;
        long j3 = avejVar.b;
        long j4 = avejVar.a;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(avejVar.q);
        instantOfEpochMilli.getClass();
        return new avdp(j4, j3, str16, str, str2, str3, j2, str4, str5, str6, str7, str8, i2, str9, uri, uri2, num, str14, str15, instantOfEpochMilli, ekfnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9 A[PHI: r3
      0x00d9: PHI (r3v4 int) = (r3v3 int), (r3v11 int) binds: [B:28:0x00bf, B:31:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.avej r(android.database.Cursor r30, defpackage.avef r31) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avgc.r(android.database.Cursor, avef):avej");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(android.net.Uri r5, java.lang.String[] r6, defpackage.ehvv r7, java.lang.String r8, defpackage.fdap r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r10 instanceof defpackage.avem
            if (r0 == 0) goto L13
            r0 = r10
            avem r0 = (defpackage.avem) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avem r0 = new avem
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            avdx r9 = r0.d
            defpackage.fctl.b(r10)
            goto L59
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r10)
            egxv r10 = r4.e
            eopy r5 = r10.a(r5, r6, r7, r8)
            fcsu r6 = r4.o
            java.lang.Object r6 = r6.b()
            r6.getClass()
            fdjx r6 = (defpackage.fdjx) r6
            fdkf r5 = defpackage.auus.b(r5, r6)
            r6 = r9
            avdx r6 = (defpackage.avdx) r6
            r0.d = r6
            r0.c = r3
            fdme r5 = (defpackage.fdme) r5
            java.lang.Object r10 = r5.hJ(r0)
            if (r10 != r1) goto L59
            return r1
        L59:
            android.database.Cursor r10 = (android.database.Cursor) r10
            aveg r5 = new aveg
            r10.getClass()
            r5.<init>(r10, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avgc.s(android.net.Uri, java.lang.String[], ehvv, java.lang.String, fdap, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(j$.time.Instant r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.avev
            if (r0 == 0) goto L13
            r0 = r10
            avev r0 = (defpackage.avev) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avev r0 = new avev
            r0.<init>(r8, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            eieu r9 = r6.d
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L76
        L2a:
            r0 = move-exception
            r10 = r0
            goto L83
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            defpackage.fctl.b(r10)
            java.lang.String r10 = "Cp2DataService#queryChangedContactIds"
            eieu r10 = defpackage.eiiy.a(r10)
            ehvw r1 = new ehvw     // Catch: java.lang.Throwable -> L7e
            r1.<init>()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = "contact_last_updated_timestamp > ?"
            r1.b(r3)     // Catch: java.lang.Throwable -> L7e
            long r3 = r9.toEpochMilli()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r9 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L7e
            r1.c(r9)     // Catch: java.lang.Throwable -> L7e
            ehvv r4 = r1.a()     // Catch: java.lang.Throwable -> L7e
            r9 = r2
            android.net.Uri r2 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch: java.lang.Throwable -> L7e
            r2.getClass()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "_id"
            java.lang.String[] r3 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L7e
            avdw r5 = new avdw     // Catch: java.lang.Throwable -> L7e
            r5.<init>()     // Catch: java.lang.Throwable -> L7e
            r6.d = r10     // Catch: java.lang.Throwable -> L7e
            r6.c = r9     // Catch: java.lang.Throwable -> L7e
            r1 = r8
            java.lang.Object r9 = r1.z(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7e
            if (r9 == r0) goto L7d
            r7 = r10
            r10 = r9
            r9 = r7
        L76:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            defpackage.fczl.a(r9, r0)
            return r10
        L7d:
            return r0
        L7e:
            r0 = move-exception
            r9 = r0
            r7 = r10
            r10 = r9
            r9 = r7
        L83:
            throw r10     // Catch: java.lang.Throwable -> L84
        L84:
            r0 = move-exception
            defpackage.fczl.a(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avgc.t(j$.time.Instant, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.util.List r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avgc.u(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.util.List r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.avfd
            if (r0 == 0) goto L13
            r0 = r10
            avfd r0 = (defpackage.avfd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avfd r0 = new avfd
            r0.<init>(r8, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            eieu r9 = r6.d
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L71
        L2a:
            r0 = move-exception
            r10 = r0
            goto Lac
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            defpackage.fctl.b(r10)
            java.lang.String r10 = "Cp2DataService#queryContactNames"
            eieu r10 = defpackage.eiiy.a(r10)
            r1 = r2
            android.net.Uri r2 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch: java.lang.Throwable -> La7
            r2.getClass()     // Catch: java.lang.Throwable -> La7
            java.lang.String[] r3 = defpackage.avgc.i     // Catch: java.lang.Throwable -> La7
            ehvw r4 = H()     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = "raw_contact_id"
            I(r4, r5, r9)     // Catch: java.lang.Throwable -> La7
            java.lang.String r9 = "AND mimetype = ?"
            r4.b(r9)     // Catch: java.lang.Throwable -> La7
            java.lang.String r9 = "vnd.android.cursor.item/name"
            r4.c(r9)     // Catch: java.lang.Throwable -> La7
            ehvv r4 = r4.a()     // Catch: java.lang.Throwable -> La7
            aveb r5 = new aveb     // Catch: java.lang.Throwable -> La7
            r5.<init>()     // Catch: java.lang.Throwable -> La7
            r6.d = r10     // Catch: java.lang.Throwable -> La7
            r6.c = r1     // Catch: java.lang.Throwable -> La7
            r1 = r8
            java.lang.Object r9 = r1.z(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La7
            if (r9 == r0) goto La6
            r7 = r10
            r10 = r9
            r9 = r7
        L71:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L2a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            r1 = 10
            int r1 = defpackage.fcva.p(r10, r1)     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L2a
        L82:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L9d
            java.lang.Object r1 = r10.next()     // Catch: java.lang.Throwable -> L2a
            avel r1 = (defpackage.avel) r1     // Catch: java.lang.Throwable -> L2a
            long r2 = r1.a     // Catch: java.lang.Throwable -> L2a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L2a
            fcti r3 = new fcti     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L2a
            r0.add(r3)     // Catch: java.lang.Throwable -> L2a
            goto L82
        L9d:
            java.util.Map r10 = defpackage.fcwa.k(r0)     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            defpackage.fczl.a(r9, r0)
            return r10
        La6:
            return r0
        La7:
            r0 = move-exception
            r9 = r0
            r7 = r10
            r10 = r9
            r9 = r7
        Lac:
            throw r10     // Catch: java.lang.Throwable -> Lad
        Lad:
            r0 = move-exception
            defpackage.fczl.a(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avgc.v(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.util.List r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.avfe
            if (r0 == 0) goto L13
            r0 = r10
            avfe r0 = (defpackage.avfe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avfe r0 = new avfe
            r0.<init>(r8, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            eieu r9 = r6.d
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L73
        L2a:
            r0 = move-exception
            r10 = r0
            goto L7e
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            defpackage.fctl.b(r10)
            java.lang.String r10 = "Cp2DataService#queryContactThirdPartyServices"
            eieu r10 = defpackage.eiiy.a(r10)
            r1 = r2
            android.net.Uri r2 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch: java.lang.Throwable -> L79
            r2.getClass()     // Catch: java.lang.Throwable -> L79
            java.lang.String[] r3 = defpackage.avgc.k     // Catch: java.lang.Throwable -> L79
            ehvw r4 = new ehvw     // Catch: java.lang.Throwable -> L79
            r4.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = "contact_id"
            I(r4, r5, r9)     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = " AND "
            r4.b(r9)     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = "mimetype"
            java.util.List r5 = defpackage.avgc.l     // Catch: java.lang.Throwable -> L79
            I(r4, r9, r5)     // Catch: java.lang.Throwable -> L79
            ehvv r4 = r4.a()     // Catch: java.lang.Throwable -> L79
            avdt r5 = new avdt     // Catch: java.lang.Throwable -> L79
            r5.<init>()     // Catch: java.lang.Throwable -> L79
            r6.d = r10     // Catch: java.lang.Throwable -> L79
            r6.c = r1     // Catch: java.lang.Throwable -> L79
            r1 = r8
            java.lang.Object r9 = r1.z(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L79
            if (r9 == r0) goto L78
            r7 = r10
            r10 = r9
            r9 = r7
        L73:
            r0 = 0
            defpackage.fczl.a(r9, r0)
            return r10
        L78:
            return r0
        L79:
            r0 = move-exception
            r9 = r0
            r7 = r10
            r10 = r9
            r9 = r7
        L7e:
            throw r10     // Catch: java.lang.Throwable -> L7f
        L7f:
            r0 = move-exception
            defpackage.fczl.a(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avgc.w(java.util.List, fcxy):java.lang.Object");
    }

    public final Object x(ehvv ehvvVar, avef avefVar, fcxy fcxyVar) {
        return fdjy.a(new avfg(this, ehvvVar, avefVar, null), fcxyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(java.util.List r10, android.net.Uri r11, boolean r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.avfl
            if (r0 == 0) goto L13
            r0 = r13
            avfl r0 = (defpackage.avfl) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            avfl r0 = new avfl
            r0.<init>(r9, r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.c
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.e
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            boolean r12 = r6.b
            java.lang.Object r10 = r6.a
            defpackage.fctl.b(r13)
            goto L92
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            defpackage.fctl.b(r13)
            if (r12 == 0) goto L6b
            java.util.ArrayList r13 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.fcva.p(r10, r1)
            r13.<init>(r1)
            java.util.Iterator r1 = r10.iterator()
        L48:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r1.next()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            boolean r5 = android.provider.ContactsContract.Contacts.isEnterpriseContactId(r3)
            if (r5 == 0) goto L62
            r7 = -1000000000(0xffffffffc4653600, double:NaN)
            long r3 = r3 + r7
        L62:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r3)
            r13.add(r5)
            goto L48
        L6b:
            r13 = r10
        L6c:
            ehvw r1 = new ehvw
            r1.<init>()
            java.lang.String r3 = "_id"
            I(r1, r3, r13)
            ehvv r4 = r1.a()
            java.lang.String[] r3 = new java.lang.String[]{r3}
            avdv r5 = new avdv
            r5.<init>()
            r6.a = r10
            r6.b = r12
            r6.e = r2
            r1 = r9
            r2 = r11
            java.lang.Object r13 = r1.z(r2, r3, r4, r5, r6)
            if (r13 != r0) goto L92
            return r0
        L92:
            java.util.List r13 = (java.util.List) r13
            if (r12 == 0) goto Lc0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L9f:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Lbf
            java.lang.Object r12 = r10.next()
            r0 = r12
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            boolean r0 = r13.contains(r2)
            if (r0 == 0) goto L9f
            r11.add(r12)
            goto L9f
        Lbf:
            return r11
        Lc0:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avgc.y(java.util.List, android.net.Uri, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(android.net.Uri r5, java.lang.String[] r6, defpackage.ehvv r7, final defpackage.fdap r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.avfq
            if (r0 == 0) goto L13
            r0 = r9
            avfq r0 = (defpackage.avfq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avfq r0 = new avfq
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L59
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r9)
            egxv r9 = r4.e
            r2 = 0
            eopy r5 = r9.a(r5, r6, r7, r2)
            avec r6 = new avec
            r6.<init>()
            aved r7 = new aved
            r7.<init>()
            java.util.concurrent.Executor r6 = r4.d
            eopy r5 = r5.e(r7, r6)
            eoqt r5 = r5.g()
            r5.getClass()
            r0.c = r3
            java.lang.Object r9 = defpackage.fdxs.c(r5, r0)
            if (r9 != r1) goto L59
            return r1
        L59:
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avgc.z(android.net.Uri, java.lang.String[], ehvv, fdap, fcxy):java.lang.Object");
    }
}
