package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwf extends kwk {
    public CharSequence a;
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private kxa d;
    private Boolean e;

    public kwf() {
    }

    @Override // defpackage.kwk
    protected final String a() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // defpackage.kwk
    public final void b(kux kuxVar) {
        kvq kvqVar = this.g;
        boolean zBooleanValue = false;
        if (kvqVar == null || kvqVar.a.getApplicationInfo().targetSdkVersion >= 28 || this.e != null) {
            Boolean bool = this.e;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } else if (this.a != null) {
            zBooleanValue = true;
        }
        h(zBooleanValue);
        Notification.MessagingStyle messagingStyleA = Build.VERSION.SDK_INT >= 28 ? kwb.a(kwy.a(this.d)) : kvz.b(this.d.a);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            kvz.a(messagingStyleA, ((kwe) it.next()).a());
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            kwa.a(messagingStyleA, ((kwe) it2.next()).a());
        }
        if (this.e.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            kvz.c(messagingStyleA, this.a);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            kwb.b(messagingStyleA, this.e.booleanValue());
        }
        messagingStyleA.setBuilder(((kwr) kuxVar).b);
    }

    @Override // defpackage.kwk
    protected final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    @Override // defpackage.kwk
    protected final void d(Bundle bundle) {
        super.d(bundle);
        List list = this.b;
        list.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.d = kxa.b(bundle.getBundle("android.messagingStyleUser"));
        } else {
            kwz kwzVar = new kwz();
            kwzVar.a = bundle.getString("android.selfDisplayName");
            this.d = new kxa(kwzVar);
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.a = charSequence;
        if (charSequence == null) {
            this.a = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            list.addAll(kwe.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.c.addAll(kwe.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.e = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public final void g(kwe kweVar) {
        if (kweVar != null) {
            List list = this.b;
            list.add(kweVar);
            if (list.size() > 25) {
                list.remove(0);
            }
        }
    }

    public final void h(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.kwk
    public final void j(Bundle bundle) {
        super.j(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.d.a);
        bundle.putBundle("android.messagingStyleUser", this.d.a());
        bundle.putCharSequence("android.hiddenConversationTitle", this.a);
        if (this.a != null && this.e.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.a);
        }
        List list = this.b;
        if (!list.isEmpty()) {
            bundle.putParcelableArray("android.messages", kwe.c(list));
        }
        List list2 = this.c;
        if (!list2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", kwe.c(list2));
        }
        Boolean bool = this.e;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    public kwf(kxa kxaVar) {
        if (!TextUtils.isEmpty(kxaVar.a)) {
            this.d = kxaVar;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
