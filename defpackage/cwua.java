package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwua extends cwty {
    private static final cqce e = cqce.g("Bugle", "WebSuggestedActionContainerViewHolder");
    private final cpbz f;
    private final Context g;
    private final RbmSuggestionData h;

    public cwua(cpbz cpbzVar, Context context, RbmSuggestionData rbmSuggestionData, View view) {
        super(context, rbmSuggestionData, view);
        this.f = cpbzVar;
        this.g = context;
        this.h = rbmSuggestionData;
    }

    @Override // defpackage.cwty
    public final Optional a(int i) throws PackageManager.NameNotFoundException {
        String host;
        String propertyValue = this.h.b.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        if (propertyValue != null && (host = Uri.parse(propertyValue).getHost()) != null) {
            Iterator<E> it = ((ewto) asow.c.e()).b.iterator();
            while (it.hasNext()) {
                if (ejuf.e((String) it.next(), host)) {
                    return f(this.g, R.drawable.product_logo_wallet_color_24, i, false);
                }
            }
        }
        Drawable applicationIcon = null;
        if (TextUtils.isEmpty(propertyValue)) {
            e.m("No url; returning default icon");
        } else {
            Intent intentC = this.f.c(propertyValue);
            PackageManager packageManager = this.g.getPackageManager();
            if (packageManager == null) {
                e.m("Couldn't access package manager; returning default icon");
            } else {
                ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intentC, 0);
                if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo == null || TextUtils.isEmpty(resolveInfoResolveActivity.activityInfo.packageName)) {
                    e.m("Couldn't resolve package name; returning default icon");
                } else {
                    String str = resolveInfoResolveActivity.activityInfo.packageName;
                    if (TextUtils.isEmpty(str) || TextUtils.equals(str, craf.b(packageManager))) {
                        e.m("No default app for url; returning default icon");
                    } else {
                        try {
                            e.m(a.v(str, "Returning icon for "));
                            applicationIcon = packageManager.getApplicationIcon(str);
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                }
            }
        }
        return applicationIcon != null ? Optional.of(this.d.h(applicationIcon)) : f(this.g, R.drawable.business_web, i, true);
    }

    @Override // defpackage.cwty
    public final String b() {
        return cwty.g(this.g.getString(R.string.conversation_suggestion_launch_web_action), c());
    }
}
