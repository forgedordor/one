package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aky {
    public ActivityOptions b;
    private ArrayList d;
    private Bundle e;
    public final Intent a = new Intent("android.intent.action.VIEW");
    private final akw c = new akw();
    private int f = 0;

    public final akz a() {
        Intent intent = this.a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        ArrayList<? extends Parcelable> arrayList = this.d;
        if (arrayList != null) {
            intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(this.c.a().a());
        Bundle bundle2 = this.e;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.b == null) {
                this.b = ActivityOptions.makeBasic();
            }
            this.b.setShareIdentityEnabled(false);
        }
        if (Build.VERSION.SDK_INT >= 36) {
            if (this.b == null) {
                this.b = ActivityOptions.makeBasic();
            }
            this.b.setAllowPassThroughOnTouchOutside(!intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = this.b;
        return new akz(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public final void b(String str, PendingIntent pendingIntent) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        Bundle bundle = new Bundle();
        bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", str);
        bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
        this.d.add(bundle);
    }

    public final void c(akx akxVar) {
        this.e = akxVar.a();
    }

    public final void d(int i) {
        this.f = i;
        if (i == 1) {
            this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        } else {
            this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        }
    }

    public final void e() {
        this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
    }

    @Deprecated
    public final void f(int i) {
        this.c.b(i);
    }
}
