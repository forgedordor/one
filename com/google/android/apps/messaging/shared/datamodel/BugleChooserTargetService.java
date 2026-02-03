package com.google.android.apps.messaging.shared.datamodel;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.text.TextUtils;
import defpackage.axgd;
import defpackage.axiw;
import defpackage.aypd;
import defpackage.aype;
import defpackage.aypf;
import defpackage.cqaz;
import defpackage.cqce;
import defpackage.crma;
import defpackage.crmx;
import defpackage.fcsu;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class BugleChooserTargetService extends axiw implements aypd {
    private static final cqce e = cqce.g("BugleServices", "BugleChooserTargetService");
    private static final long f = TimeUnit.SECONDS.toMillis(2);
    public fcsu a;
    public fcsu b;
    public fcsu c;
    public fcsu d;
    private List g;
    private final Object h = new Object();
    private boolean i = false;

    private final void d() {
        this.i = true;
        Object obj = this.h;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    @Override // defpackage.aypd
    public final void a() {
        e.m("onGetFrecencyConversationActionFailed.");
        this.g = null;
        d();
    }

    @Override // defpackage.aypd
    public final void b(List list) {
        this.g = list;
        d();
    }

    @Override // android.service.chooser.ChooserTargetService
    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        e.m("onGetChooserTargets called().");
        this.g = new ArrayList();
        boolean z = true;
        if (!TextUtils.equals("com.google.android.apps.messaging.ui.conversationlist.ShareIntentActivity", componentName.getClassName()) && !TextUtils.equals("com.google.android.apps.messaging.ui.conversationlist.VideoShareIntentActivity", componentName.getClassName()) && !TextUtils.equals("com.google.android.apps.messaging.ui.conversationlist.SharePdfIntentActivity", componentName.getClassName()) && !TextUtils.equals("com.google.android.apps.messaging.ui.conversationlist.ShareCalendarIntentActivity", componentName.getClassName()) && !TextUtils.equals("com.google.android.apps.messaging.ui.conversationlist.SharePhaseOneSupportedFileIntentActivity", componentName.getClassName())) {
            z = false;
        }
        cqaz.k(z);
        ((axgd) this.c.b()).a = componentName;
        if (((crma) this.a.b()).j() && ((crmx) this.b.b()).K()) {
            ((aypf) this.d.b()).a().G(new aype(this));
            while (!this.i) {
                Object obj = this.h;
                synchronized (obj) {
                    try {
                        try {
                            obj.wait(f);
                        } catch (InterruptedException unused) {
                            return this.g;
                        }
                    } finally {
                    }
                }
            }
        }
        return this.g;
    }
}
