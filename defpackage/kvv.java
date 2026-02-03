package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvv extends kwk {
    public PendingIntent a;
    public PendingIntent b;
    public PendingIntent c;
    public boolean d;
    public Integer e;
    public Integer f;
    private int k;
    private kxa l;
    private IconCompat m;
    private CharSequence n;

    @Override // defpackage.kwk
    protected final String a() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.CharSequence] */
    @Override // defpackage.kwk
    public final void b(kux kuxVar) throws Resources.NotFoundException {
        String string = null;
        callStyleA = null;
        Notification.CallStyle callStyleA = null;
        if (Build.VERSION.SDK_INT >= 31) {
            int i = this.k;
            if (i == 1) {
                callStyleA = kvu.a(kwy.a(this.l), this.b, this.a);
            } else if (i == 2) {
                callStyleA = kvu.b(kwy.a(this.l), this.c);
            } else if (i == 3) {
                callStyleA = kvu.c(kwy.a(this.l), this.c, this.a);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: ".concat(String.valueOf(String.valueOf(this.k))));
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(((kwr) kuxVar).b);
                Integer num = this.e;
                if (num != null) {
                    kvu.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f;
                if (num2 != null) {
                    kvu.e(callStyleA, num2.intValue());
                }
                kvu.h(callStyleA, this.n);
                IconCompat iconCompat = this.m;
                if (iconCompat != null) {
                    kvu.g(callStyleA, kzt.c(iconCompat, this.g.a));
                }
                kvu.f(callStyleA, this.d);
                return;
            }
            return;
        }
        Notification.Builder builder = ((kwr) kuxVar).b;
        kxa kxaVar = this.l;
        builder.setContentTitle(kxaVar != null ? kxaVar.a : null);
        Bundle bundle = this.g.B;
        String charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.g.B.getCharSequence("android.text");
        if (charSequence == null) {
            int i2 = this.k;
            if (i2 == 1) {
                string = this.g.a.getResources().getString(R.string.call_notification_incoming_text);
            } else if (i2 == 2) {
                string = this.g.a.getResources().getString(R.string.call_notification_ongoing_text);
            } else if (i2 == 3) {
                string = this.g.a.getResources().getString(R.string.call_notification_screening_text);
            }
        } else {
            string = charSequence;
        }
        builder.setContentText(string);
        kxa kxaVar2 = this.l;
        if (kxaVar2 != null) {
            IconCompat iconCompat2 = kxaVar2.b;
            if (iconCompat2 != null) {
                kvs.a(builder, kzt.c(iconCompat2, this.g.a));
            }
            if (Build.VERSION.SDK_INT >= 28) {
                kvt.a(builder, kwy.a(this.l));
            } else {
                kvr.a(builder, this.l.c);
            }
        }
        kvr.b(builder, "call");
    }

    @Override // defpackage.kwk
    protected final void d(Bundle bundle) {
        super.d(bundle);
        this.k = bundle.getInt("android.callType");
        this.d = bundle.getBoolean("android.callIsVideo");
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.l = kwy.b(oc$$ExternalSyntheticApiModelOutline0.m((Object) bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.l = kxa.b(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            this.m = kzt.e((Icon) bundle.getParcelable("android.verificationIcon"));
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.m = IconCompat.f(bundle.getBundle("android.verificationIconCompat"));
        }
        this.n = bundle.getCharSequence("android.verificationText");
        this.a = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.b = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.c = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.e = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.f = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }

    public final kvf e(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(this.g.a.getColor(i3));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.g.a.getResources().getString(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        kvf kvfVarA = new kve(IconCompat.h(this.g.a, i), spannableStringBuilder, pendingIntent).a();
        kvfVarA.a.putBoolean("key_action_priority", true);
        return kvfVarA;
    }

    @Override // defpackage.kwk
    public final void j(Bundle bundle) {
        super.j(bundle);
        bundle.putInt("android.callType", this.k);
        bundle.putBoolean("android.callIsVideo", this.d);
        if (this.l != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("android.callPerson", kwy.a(this.l));
            } else {
                bundle.putParcelable("android.callPersonCompat", this.l.a());
            }
        }
        IconCompat iconCompat = this.m;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", kzt.c(iconCompat, this.g.a));
        }
        bundle.putCharSequence("android.verificationText", this.n);
        bundle.putParcelable("android.answerIntent", this.a);
        bundle.putParcelable("android.declineIntent", this.b);
        bundle.putParcelable("android.hangUpIntent", this.c);
        Integer num = this.e;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.f;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }
}
