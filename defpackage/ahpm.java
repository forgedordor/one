package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ahpm extends cgan implements cgdu {
    public static final eksp a = eksp.c("BugleNotifications");
    protected final Context b;
    protected final cgbn c;
    protected final crac d;
    protected final cqzr e;
    protected final crab f;
    protected final fcsu g;
    protected final Optional h;
    protected final Optional i;
    protected final cuhf j;
    final List k;
    kvq l;
    protected String m;
    protected CharSequence n;
    protected String o;

    public ahpm(Context context, final cqzr cqzrVar, cgbn cgbnVar, crac cracVar, crab crabVar, fcsu fcsuVar, Optional optional, Optional optional2, List list, cgaz cgazVar, cuhf cuhfVar, String str) {
        super(cgazVar.b(cgbe.REMINDER, str, new cgda() { // from class: ahpj
            @Override // defpackage.cgda
            public final NotificationChannel a() {
                eksp ekspVar = ahpm.a;
                return cqzrVar.h();
            }
        }));
        this.m = null;
        this.n = null;
        this.o = null;
        this.b = context;
        this.c = cgbnVar;
        this.d = cracVar;
        this.e = cqzrVar;
        this.f = crabVar;
        this.g = fcsuVar;
        this.h = optional;
        this.i = optional2;
        this.k = list;
        this.j = cuhfVar;
    }

    @Override // defpackage.cgan, defpackage.cgbf
    public final Notification b() {
        return this.l.a();
    }

    protected abstract List e();

    protected abstract void f();

    protected abstract void g();

    protected abstract void h();

    protected abstract void i();

    protected abstract boolean j();

    final Uri k() throws Resources.NotFoundException {
        NotificationChannel notificationChannelH = this.e.h();
        if (notificationChannelH == null) {
            return null;
        }
        return notificationChannelH.getSound();
    }

    final void l() throws Resources.NotFoundException {
        if (j()) {
            Uri uriK = k();
            if (uriK != null) {
                final crab crabVar = this.f;
                if (crabVar.e.getRingerMode() != 2) {
                    ((eksl) ((eksl) crab.a.h()).h("com/google/android/apps/messaging/shared/util/notifications/NotificationSoundUtil", "playNotificationSound", 178, "NotificationSoundUtil.java")).q("Ringer mode silenced: notification sound not played");
                } else if (((Boolean) crab.b.e()).booleanValue()) {
                    cquu cquuVar = new cquu();
                    cquuVar.a = new cquq(uriK);
                    cquuVar.d(0.25f);
                    cquuVar.b(new AudioAttributes.Builder().setUsage(8).build());
                    cquuVar.c(new cquw());
                    eiju eijuVarJ = crabVar.d.a(cquuVar.a()).j(5L, TimeUnit.SECONDS, crabVar.g);
                    ejvr ejvrVar = new ejvr() { // from class: cqzy
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            cqup cqupVar = (cqup) obj;
                            ((eksl) ((eksl) crab.a.h()).h("com/google/android/apps/messaging/shared/util/notifications/NotificationSoundUtil", "playWithBugleAudioPlayer", 288, "NotificationSoundUtil.java")).U(cqupVar);
                            return cqupVar;
                        }
                    };
                    eoqg eoqgVar = eoqg.a;
                    auvh.h(eijuVarJ.h(ejvrVar, eoqgVar).e(TimeoutException.class, new ejvr() { // from class: cqzz
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            ((eksl) ((eksl) crab.a.h()).h("com/google/android/apps/messaging/shared/util/notifications/NotificationSoundUtil", "playWithBugleAudioPlayer", 295, "NotificationSoundUtil.java")).s("Playback didn't finish within: %d seconds", 5L);
                            return cqup.c(3);
                        }
                    }, eoqgVar).e(cqve.class, new ejvr() { // from class: craa
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            ((eksl) ((eksl) ((eksl) crab.a.j()).g((cqve) obj)).h("com/google/android/apps/messaging/shared/util/notifications/NotificationSoundUtil", "playWithBugleAudioPlayer", 303, "NotificationSoundUtil.java")).q("Failed to play notification sound");
                            return cqup.c(2);
                        }
                    }, eoqgVar));
                } else {
                    cogw cogwVar = crabVar.f;
                    AtomicLong atomicLong = crabVar.h;
                    final long jB = cogwVar.b();
                    atomicLong.set(jB);
                    cqzv cqzvVar = crabVar.c;
                    cqzt cqztVar = new cqzt();
                    cqztVar.d = SystemClock.elapsedRealtime();
                    cqztVar.a = 1;
                    cqztVar.b = uriK;
                    cqztVar.c = 0.25f;
                    cqztVar.e = SettableFuture.create();
                    synchronized (cqzvVar.b) {
                        cqzvVar.a(cqztVar);
                        cqzvVar.j = 1;
                    }
                    eiju.g(cqztVar.e);
                    eika.l(crabVar.g.schedule(new Callable() { // from class: cqzw
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            crab crabVar2 = crabVar;
                            if (crabVar2.h.get() != jB) {
                                return false;
                            }
                            cqzv cqzvVar2 = crabVar2.c;
                            synchronized (cqzvVar2.b) {
                                if (cqzvVar2.j != 2) {
                                    cqzt cqztVar2 = new cqzt();
                                    cqztVar2.d = SystemClock.elapsedRealtime();
                                    cqztVar2.a = 2;
                                    cqzvVar2.a(cqztVar2);
                                    cqzvVar2.j = 2;
                                }
                            }
                            return true;
                        }
                    }, 5L, TimeUnit.SECONDS), auvh.c(new Consumer() { // from class: cqzx
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ((eksl) crab.a.o().h("com/google/android/apps/messaging/shared/util/notifications/NotificationSoundUtil", "playNotificationSound", 213, "NotificationSoundUtil.java")).t("Notification sound playback stop %s", true != ((Boolean) obj).booleanValue() ? "not requested" : "requested");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }), eoqg.a);
                }
            }
            String str = this.o;
            if (str != null) {
                final String[] strArr = {str};
                this.h.ifPresent(new Consumer() { // from class: ahph
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        eksp ekspVar = ahpm.a;
                        cqnx.c(((clfb) obj).b(strArr), "BugleNotifications", "Failed to dismiss reminders");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            ((eksl) a.o().h("com/google/android/apps/messaging/reminder/notification/ReminderNotification", "processAndPost", 189, "ReminderNotification.java")).q("Skip reminder notification as conversation is focused.");
            return;
        }
        String strO = o();
        Context context = this.b;
        kvq kvqVar = new kvq(context, strO);
        this.l = kvqVar;
        kvqVar.r(R.drawable.notification_icon);
        kvqVar.C = context.getColor(R.color.primary_brand_non_icon_color);
        kvqVar.l = 4;
        kvqVar.t(k());
        kvqVar.g(true);
        cgbn cgbnVar = this.c;
        Resources resources = context.getResources();
        int width = ((cgar) cgbnVar.e()).a.getWidth();
        int height = ((cgar) cgbnVar.e()).a.getHeight();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.reminder_notification_large_icon_offset_percentage, typedValue, true);
        float f = typedValue.getFloat();
        float f2 = width;
        float f3 = height;
        int iRound = Math.round(f2 * f);
        int iRound2 = Math.round(f * f3);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, true != czwc.b() ? R.drawable.quantum_ic_alarm_on_googblue_48 : R.drawable.quantum_ic_alarm_googblue_48);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (!czwc.b()) {
            Paint paint = new Paint(1);
            paint.setColor(context.getColor(R.color.reminder_notification_large_icon_border_color));
            float dimension = resources.getDimension(R.dimen.reminder_notification_large_icon_stroke_width);
            paint.setStrokeWidth(dimension);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(f2 / 2.0f, f3 / 2.0f, (Math.min(width, height) / 2.0f) - (dimension / 2.0f), paint);
        }
        Paint paint2 = new Paint(2);
        if (czwc.b()) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_GoogleMaterial3_DayNight);
            Optional optionalA = this.j.a();
            if (optionalA.isPresent()) {
                contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, ((Integer) optionalA.get()).intValue());
            }
            paint2.setColorFilter(new PorterDuffColorFilter(eehg.d(contextThemeWrapper, R.attr.colorPrimary, "ReminderNotification"), PorterDuff.Mode.SRC_IN));
        }
        canvas.drawBitmap(bitmapDecodeResource, new Rect(0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight()), new Rect(iRound, iRound2, width - iRound, height - iRound2), paint2);
        if (bitmapCreateBitmap != null) {
            this.l.m(bitmapCreateBitmap);
        }
        this.h.ifPresent(new Consumer() { // from class: ahpi
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ahpm ahpmVar = this.a;
                ahpmVar.l.k(((clfb) obj).k(ahpmVar.n()));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        g();
        f();
        h();
        i();
        synchronized (cgbnVar) {
            cgbnVar.H(this);
        }
    }

    @Override // defpackage.cgdu
    public final void m() throws Resources.NotFoundException {
        final List listE = e();
        this.i.ifPresent(new Consumer() { // from class: ahpg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                czwb czwbVar = (czwb) obj;
                eika.l(czwbVar.a(), new ahpk(this.a), eoqg.a);
                czwbVar.b(listE);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        l();
    }

    public final String[] n() {
        return (String[]) Collection.EL.stream(this.k).map(new Function() { // from class: ahpe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ahpl) obj).e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray(new IntFunction() { // from class: ahpf
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                eksp ekspVar = ahpm.a;
                return new String[i];
            }
        });
    }
}
