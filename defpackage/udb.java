package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.ui.vcard.VCardDetailActivity;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udb implements avbr {
    static final cczi a = cdag.h(cdag.b, "disable_logging_uma_contact_details_launch", false);
    private final bxfu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final dakl f;
    private final alrj g;
    private final fcsu h;
    private final fcsu i;

    public udb(bxfu bxfuVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, dakl daklVar, alrj alrjVar, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.b = bxfuVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = daklVar;
        this.g = alrjVar;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
    }

    @Override // defpackage.avbr
    public final void a(Context context, Uri uri) {
        bxfu bxfuVar = this.b;
        Uri uriE = bxlf.e(context, uri);
        ejwl.a(bxfuVar.j(uriE));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(uriE, "text/x-vCard".toLowerCase(Locale.US));
        intent.addFlags(1);
        this.f.o(context, intent);
        ((udd) this.c.b()).a(7);
    }

    @Override // defpackage.avbr
    public final void b(Context context, Uri uri) throws IOException {
        eiid.o(context, new Intent(context, (Class<?>) VCardDetailActivity.class).putExtra("vcard_uri", bxlf.e(context, uri)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    @Override // defpackage.avbr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.Context r8, defpackage.alqm r9, int r10, java.util.List r11) {
        /*
            r7 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.INSERT"
            r0.<init>(r1)
            cczv r1 = defpackage.alvx.a
            alur r1 = new alur
            r1.<init>()
            java.lang.Object r1 = r1.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "phone"
            java.lang.String r3 = "email"
            r4 = 1
            if (r1 == 0) goto L26
            boolean r5 = r9.t()
            if (r4 == r5) goto L33
            goto L34
        L26:
            java.lang.String r5 = r9.n()
            cqce r6 = defpackage.cmvy.a
            boolean r5 = defpackage.alwh.i(r5)
            if (r4 == r5) goto L33
            goto L34
        L33:
            r2 = r3
        L34:
            java.lang.String r3 = "vnd.android.cursor.dir/contact"
            r0.setType(r3)
            fcsu r3 = r7.h
            java.lang.Object r3 = r3.b()
            apzt r3 = (defpackage.apzt) r3
            boolean r3 = r3.a()
            if (r3 == 0) goto L4c
            java.lang.String r9 = r9.m(r1)
            goto L50
        L4c:
            java.lang.String r9 = r9.p(r1)
        L50:
            r0.putExtra(r2, r9)
            if (r11 == 0) goto L65
            boolean r9 = r11.isEmpty()
            if (r9 != 0) goto L65
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r11)
            java.lang.String r11 = "data"
            r0.putParcelableArrayListExtra(r11, r9)
        L65:
            boolean r9 = r8 instanceof android.app.Activity
            if (r9 != 0) goto L6e
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r9)
        L6e:
            dakl r9 = r7.f
            r9.o(r8, r0)
            fcsu r8 = r7.c
            java.lang.Object r8 = r8.b()
            udd r8 = (defpackage.udd) r8
            r8.a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udb.c(android.content.Context, alqm, int, java.util.List):void");
    }

    @Override // defpackage.avbr
    public final void d(Context context, Uri uri, final int i, List list) {
        Intent intent = new Intent("android.intent.action.EDIT");
        intent.setDataAndType(uri, "vnd.android.cursor.item/contact");
        intent.putExtra("finishActivityOnSaveCompleted", true);
        if (list != null && !list.isEmpty()) {
            intent.putParcelableArrayListExtra(GroupManagementRequest.DATA_TAG, new ArrayList<>(list));
        }
        this.f.o(context, intent);
        ((udm) this.d.b()).a.b(new fdap() { // from class: udl
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                elgq elgqVar = (elgq) obj;
                elgqVar.getClass();
                elgqVar.a(i);
                elgqVar.b(4);
                return fctx.a;
            }
        });
    }

    protected final void e(Context context, View view, Rect rect, long j, String str, long j2, alqm alqmVar, int i, List list) {
        if (context == null && view != null) {
            context = view.getContext();
        }
        if (j == -1 || TextUtils.isEmpty(str)) {
            if (alqmVar != null) {
                if (!((aqix) this.i.b()).a()) {
                    cczv cczvVar = alvx.a;
                    if (bbbd.n(alqmVar.p(((Boolean) new alur().get()).booleanValue()))) {
                        return;
                    }
                }
                alqm alqmVarW = this.g.w(alqmVar);
                context.getClass();
                c(context, alqmVarW, i, list);
                return;
            }
            return;
        }
        Uri uriWithAppendedPath = j == -2 ? Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_LOOKUP_URI, str) : ContactsContract.Contacts.getLookupUri(j, str);
        if (j2 != -1) {
            uriWithAppendedPath = uriWithAppendedPath.buildUpon().appendQueryParameter("directory", Long.toString(j2)).build();
        }
        context.getClass();
        String[] strArr = new String[0];
        if (view != null) {
            ContactsContract.QuickContact.showQuickContact(context, view, uriWithAppendedPath, 3, strArr);
        } else if (rect != null) {
            ContactsContract.QuickContact.showQuickContact(context, rect, uriWithAppendedPath, 3, strArr);
        }
        if (((Boolean) a.e()).booleanValue()) {
            return;
        }
        ains ainsVar = (ains) this.e.b();
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        ainsVar.e("Bugle.Contact.Details.Launch.Counts", i2);
    }

    @Override // defpackage.avbr
    public final void f(View view, long j, String str, long j2, alqm alqmVar, int i) {
        e(null, view, null, j, str, j2, alqmVar, i, null);
    }

    @Override // defpackage.avbr
    public final void g(Context context, Rect rect, long j, String str, long j2, alqm alqmVar, int i, List list) {
        e(context, null, rect, j, str, j2, alqmVar, i, list);
    }

    @Override // defpackage.avbr
    public final void h(Context context, Uri uri) {
        d(context, uri, 2, null);
    }
}
