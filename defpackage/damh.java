package defpackage;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Size;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.RebuildShortcutsAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class damh extends cqdn {
    public static final cqce a = cqce.g("Bugle", "ShortcutUtilImpl");
    private static boolean k;
    public final fcsu b;
    public final fcsu c;
    public final Context d;
    public int e;
    public final cogw f;
    public final fcsu g;
    public final eosd h;
    public final fcsu i;
    int j = 0;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final eosc o;
    private final eosc p;
    private final Optional q;
    private final fcsu r;
    private final crsx s;
    private final fcsu t;

    public damh(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, Context context, fcsu fcsuVar4, cogw cogwVar, fcsu fcsuVar5, fcsu fcsuVar6, eosc eoscVar, eosc eoscVar2, eosd eosdVar, Optional optional, fcsu fcsuVar7, crsx crsxVar, fcsu fcsuVar8, fcsu fcsuVar9) {
        this.l = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = context;
        this.m = fcsuVar4;
        this.f = cogwVar;
        this.n = fcsuVar5;
        this.g = fcsuVar6;
        this.o = eoscVar;
        this.p = eoscVar2;
        this.h = eosdVar;
        this.q = optional;
        this.r = fcsuVar7;
        this.s = crsxVar;
        this.i = fcsuVar8;
        this.t = fcsuVar9;
    }

    @Override // defpackage.cqdn
    public final ConversationId a(String str) {
        ShortcutManager shortcutManagerM578m = kyg$$ExternalSyntheticApiModelOutline0.m578m(this.d.getSystemService(kyg$$ExternalSyntheticApiModelOutline0.m()));
        if (shortcutManagerM578m != null) {
            Iterator it = shortcutManagerM578m.getDynamicShortcuts().iterator();
            while (true) {
                if (it.hasNext()) {
                    ShortcutInfo shortcutInfoM = kyg$$ExternalSyntheticApiModelOutline0.m(it.next());
                    Intent intent = shortcutInfoM.getIntent();
                    if (shortcutInfoM.getId().equals(str) && intent != null) {
                        ConversationId conversationIdA = ((ajso) this.r.b()).a(intent);
                        if (conversationIdA != null) {
                            return conversationIdA;
                        }
                    }
                } else if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
                    return new BugleConversationId(str);
                }
            }
        }
        return InvalidConversationId.a;
    }

    @Override // defpackage.cqdn
    public final eiju b(final ConversationId conversationId, final String str, final alqm alqmVar, final String str2, final boolean z) {
        if (!craf.d) {
            return eijx.e(false);
        }
        eiju eijuVarG = eijx.g(new Callable() { // from class: dalz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqce cqceVar = damh.a;
                botb botbVarE = botm.e();
                botbVarE.A("createShortcut");
                botbVarE.g(new Function() { // from class: damg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cqce cqceVar2 = damh.a;
                        return ((bopp) obj).t;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final ConversationId conversationId2 = conversationId;
                botbVarE.i(new Function() { // from class: dalr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        botl botlVar = (botl) obj;
                        cqce cqceVar2 = damh.a;
                        botlVar.r(barn.b(conversationId2.b()));
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bojh bojhVar = (bojh) botbVarE.b().l();
                if (bojhVar != null) {
                    return bojhVar.X();
                }
                return null;
            }
        }, this.p);
        eooz eoozVar = new eooz() { // from class: damc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                damh damhVar = this.a;
                Context context = damhVar.d;
                ConversationId conversationId2 = conversationId;
                String str3 = str;
                String str4 = str2;
                return damhVar.m(context, conversationId2, str3, alqmVar, (String) obj, akbl.b, -1, str4, 2147483646, z);
            }
        };
        eosd eosdVar = this.h;
        return eijuVarG.i(eoozVar, eosdVar).i(new eooz() { // from class: damd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ShortcutInfo shortcutInfoM = kyg$$ExternalSyntheticApiModelOutline0.m(obj);
                if (shortcutInfoM == null) {
                    return eijx.e(false);
                }
                damh damhVar = this.a;
                kyg$$ExternalSyntheticApiModelOutline0.m578m(damhVar.d.getSystemService(kyg$$ExternalSyntheticApiModelOutline0.m())).pushDynamicShortcut(shortcutInfoM);
                return eijx.e(true);
            }
        }, eosdVar);
    }

    @Override // defpackage.cqdn
    public final eiju c(String str, final Context context, boolean z, int i) {
        if (str == null) {
            return eijx.e(null);
        }
        this.q.isPresent();
        if (((aquo) this.t.b()).a() && fdbq.f(str, ccwh.a.toString())) {
            return eijx.e(IconCompat.h(context, R.drawable.emergency_rcs_avatar));
        }
        if (!z) {
            return eijx.e(IconCompat.h(context, cdmi.a(i)));
        }
        final Uri uri = Uri.parse(str);
        final int color = ((cpch) this.n.b()).g() ? context.getColor(R.color.adaptive_background_color_dark) : context.getColor(R.color.adaptive_background_color_light);
        return eijx.g(new Callable() { // from class: damf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                damh damhVar = this.a;
                fcsu fcsuVar = damhVar.c;
                cphu cphuVar = (cphu) fcsuVar.b();
                int width = damhVar.l().getWidth();
                int height = damhVar.l().getHeight();
                Context context2 = context;
                Bitmap bitmapB = cphuVar.b(context2, uri, width, height, color, false);
                if (bitmapB == null) {
                    return null;
                }
                cphu cphuVar2 = (cphu) fcsuVar.b();
                int width2 = bitmapB.getWidth() / 4;
                int height2 = bitmapB.getHeight() / 4;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapB.getWidth() + width2 + width2, bitmapB.getHeight() + height2 + height2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawColor(((cpch) cphuVar2.a.b()).g() ? context2.getColor(R.color.adaptive_background_color_dark) : context2.getColor(R.color.adaptive_background_color_light));
                canvas.drawBitmap(bitmapB, width2, height2, (Paint) null);
                lca.a(bitmapCreateBitmap);
                IconCompat iconCompat = new IconCompat(5);
                iconCompat.c = bitmapCreateBitmap;
                return iconCompat;
            }
        }, this.o);
    }

    @Override // defpackage.cqdn
    public final String d(String str) {
        ShortcutManager shortcutManagerM578m = kyg$$ExternalSyntheticApiModelOutline0.m578m(this.d.getSystemService(kyg$$ExternalSyntheticApiModelOutline0.m()));
        if (shortcutManagerM578m == null) {
            return null;
        }
        Iterator it = shortcutManagerM578m.getDynamicShortcuts().iterator();
        while (it.hasNext()) {
            ShortcutInfo shortcutInfoM = kyg$$ExternalSyntheticApiModelOutline0.m(it.next());
            PersistableBundle extras = shortcutInfoM.getExtras();
            if (shortcutInfoM.getId().equals(str) && extras != null) {
                return extras.getString("conversation_id");
            }
        }
        if (TextUtils.isEmpty(str) || !TextUtils.isDigitsOnly(str)) {
            return null;
        }
        return str;
    }

    @Override // defpackage.cqdn
    public final String e(ConversationIdType conversationIdType) {
        return this.s.a(conversationIdType);
    }

    @Override // defpackage.cqdn
    public final void f(final Context context) {
        eika.l(this.p.submit(eiid.k(new Runnable() { // from class: dalv
            public final /* synthetic */ String c = "manifest-shortcut-new_message";

            @Override // java.lang.Runnable
            public final void run() {
                kyg$$ExternalSyntheticApiModelOutline0.m578m(context.getSystemService(kyg$$ExternalSyntheticApiModelOutline0.m())).reportShortcutUsed(this.c);
                this.a.j++;
            }
        })), new cqob(new Consumer() { // from class: dalw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                damh.a.m("Report shortcut used completed successfully");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: dalx
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                damh.a.s("Unable to successfully report shortcut used", (Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), eoqg.a);
    }

    @Override // defpackage.cqdn
    public final void g() {
        k = true;
    }

    @Override // defpackage.cqdn
    public final void h() {
        if (k) {
            k = false;
            axzj axzjVar = (axzj) this.l.b();
            Context context = (Context) axzjVar.a.b();
            context.getClass();
            Optional optional = (Optional) axzjVar.b.b();
            optional.getClass();
            baci baciVar = (baci) axzjVar.c.b();
            baciVar.getClass();
            eosd eosdVar = (eosd) axzjVar.d.b();
            eosdVar.getClass();
            eosd eosdVar2 = (eosd) axzjVar.e.b();
            eosdVar2.getClass();
            new RebuildShortcutsAction(context, optional, baciVar, eosdVar, eosdVar2).K();
        }
    }

    @Override // defpackage.cqdn
    public final boolean i(String str) {
        return this.s.b(str);
    }

    @Override // defpackage.cqdn
    public final eiju j() {
        a.p("Starting rebuild shortcuts v2");
        final long epochMilli = this.f.f().toEpochMilli();
        eiju eijuVarG = eijx.g(new Callable() { // from class: dals
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i;
                ArrayList arrayList;
                css cssVar;
                List arrayList2;
                damh damhVar = this.a;
                ShortcutManager shortcutManagerM578m = kyg$$ExternalSyntheticApiModelOutline0.m578m(damhVar.d.getSystemService(kyg$$ExternalSyntheticApiModelOutline0.m()));
                css cssVar2 = new css();
                css cssVar3 = new css();
                css cssVar4 = new css();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = shortcutManagerM578m.getPinnedShortcuts().iterator();
                while (it.hasNext()) {
                    ShortcutInfo shortcutInfoM = kyg$$ExternalSyntheticApiModelOutline0.m(it.next());
                    if (!cssVar2.contains(shortcutInfoM.getId()) && !shortcutInfoM.isDeclaredInManifest()) {
                        cssVar2.add(shortcutInfoM.getId());
                    }
                }
                Iterator it2 = shortcutManagerM578m.getDynamicShortcuts().iterator();
                while (it2.hasNext()) {
                    cssVar4.add(kyg$$ExternalSyntheticApiModelOutline0.m(it2.next()).getId());
                }
                if (craf.d) {
                    try {
                        arrayList2 = (List) Collection.EL.stream(shortcutManagerM578m.getShortcuts(8)).map(new Function() { // from class: dalq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return kyg$$ExternalSyntheticApiModelOutline0.m(obj).getId();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new Supplier() { // from class: damb
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new ArrayList();
                            }
                        }));
                    } catch (RuntimeException e) {
                        damh.a.s("Failed to get shortcuts: ", e);
                        arrayList2 = new ArrayList();
                    }
                    cssVar3.addAll(arrayList2);
                }
                badt badtVar = (badt) damhVar.b.b();
                int maxShortcutCountPerActivity = damhVar.e;
                if (maxShortcutCountPerActivity <= 0) {
                    maxShortcutCountPerActivity = shortcutManagerM578m.getMaxShortcutCountPerActivity();
                    damhVar.e = maxShortcutCountPerActivity;
                }
                int i2 = maxShortcutCountPerActivity;
                ekgb ekgbVarZ = bcvg.n().a().l().z();
                int size = ekgbVarZ.size();
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < size) {
                    int i6 = i2 - 1;
                    badtVar.L((bbtk) ekgbVarZ.get(i3));
                    String strE = damhVar.e(badtVar.J());
                    ekgb ekgbVar = ekgbVarZ;
                    String strO = badtVar.o();
                    ArrayList arrayList4 = arrayList3;
                    ConversationId conversationIdH = badtVar.H();
                    int i7 = i3;
                    String strN = badtVar.n();
                    int iC = badtVar.c();
                    Optional optionalK = badtVar.k();
                    boolean zP = badtVar.P();
                    int i8 = size;
                    String str = (String) optionalK.map(new Function() { // from class: dama
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            cqce cqceVar = damh.a;
                            cczv cczvVar = alvx.a;
                            return ((alqm) obj).p(((Boolean) new alvu().get()).booleanValue());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(null);
                    cssVar2.remove(strE);
                    cssVar3.remove(strE);
                    cssVar4.remove(strE);
                    cssVar2.remove(damhVar.o(str, strO));
                    cssVar2.remove(damhVar.p(str, strO));
                    if (i4 >= i6 || !((cqdm) damhVar.g.b()).a(badtVar)) {
                        i = i4;
                        arrayList = arrayList4;
                        cssVar = cssVar4;
                    } else {
                        css cssVar5 = cssVar4;
                        Context context = damhVar.d;
                        alqm alqmVar = (alqm) optionalK.orElse(null);
                        i = i4;
                        arrayList = arrayList4;
                        cssVar = cssVar5;
                        arrayList.add(damhVar.m(context, conversationIdH, strO, alqmVar, strN, badtVar.I(), iC, strE, i5, zP));
                        i5++;
                    }
                    i3 = i7 + 1;
                    i4 = i + 1;
                    arrayList3 = arrayList;
                    cssVar4 = cssVar;
                    ekgbVarZ = ekgbVar;
                    size = i8;
                }
                css cssVar6 = cssVar4;
                ArrayList arrayList5 = arrayList3;
                if (!cssVar2.isEmpty()) {
                    damh.a.p("Disabling pinned shortcuts: size=" + cssVar2.c);
                    shortcutManagerM578m.disableShortcuts(ekjz.a(cssVar2));
                }
                if (craf.d && !cssVar3.isEmpty()) {
                    damh.a.p("Deleting long lived shortcuts: size=" + cssVar3.c);
                    shortcutManagerM578m.removeLongLivedShortcuts(ekjz.a(cssVar3));
                }
                damh.a.p("Removing dynamic shortcuts: size=" + cssVar6.c);
                shortcutManagerM578m.removeDynamicShortcuts(new ArrayList(cssVar6));
                return arrayList5;
            }
        }, this.p);
        eooz eoozVar = new eooz() { // from class: dalt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final List list = (List) obj;
                eijw eijwVarL = eijx.l(list);
                final damh damhVar = this.a;
                return eijwVarL.a(new Callable() { // from class: daly
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        damh damhVar2 = damhVar;
                        ShortcutManager shortcutManagerM578m = kyg$$ExternalSyntheticApiModelOutline0.m578m(damhVar2.d.getSystemService(kyg$$ExternalSyntheticApiModelOutline0.m()));
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ShortcutInfo shortcutInfoM = kyg$$ExternalSyntheticApiModelOutline0.m(eork.q((eiju) it.next()));
                            if (shortcutInfoM != null) {
                                arrayList.add(shortcutInfoM);
                            }
                        }
                        damh.a.p("Setting dynamic shortcuts: size=" + arrayList.size());
                        shortcutManagerM578m.setDynamicShortcuts(arrayList);
                        return null;
                    }
                }, damhVar.h);
            }
        };
        eosd eosdVar = this.h;
        return eijuVarG.i(eoozVar, eosdVar).h(new ejvr() { // from class: dalu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                long epochMilli2 = this.a.f.f().toEpochMilli() - epochMilli;
                damh.a.q("RebuildShortcuts FULL time: " + epochMilli2 + " ms");
                return null;
            }
        }, eosdVar);
    }

    @Override // defpackage.cqdn
    public final ShortcutInfo k(Context context, ConversationId conversationId, String str, alqm alqmVar, IconCompat iconCompat, String str2, int i) {
        int length;
        int length2;
        kyd kydVarC = this.s.c(context, conversationId, n(str, alqmVar), iconCompat, str2, i);
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(kydVarC.a, kydVarC.b).setShortLabel(kydVarC.e).setIntents(kydVarC.c);
        IconCompat iconCompat2 = kydVarC.h;
        if (iconCompat2 != null) {
            intents.setIcon(kzt.c(iconCompat2, kydVarC.a));
        }
        if (!TextUtils.isEmpty(kydVarC.f)) {
            intents.setLongLabel(kydVarC.f);
        }
        if (!TextUtils.isEmpty(kydVarC.g)) {
            intents.setDisabledMessage(kydVarC.g);
        }
        ComponentName componentName = kydVarC.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set set = kydVarC.j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(kydVarC.m);
        PersistableBundle persistableBundle = kydVarC.n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            kxa[] kxaVarArr = kydVarC.i;
            if (kxaVarArr != null && (length2 = kxaVarArr.length) > 0) {
                Person[] personArr = new Person[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    personArr[i2] = kwy.a(kydVarC.i[i2]);
                }
                intents.setPersons(personArr);
            }
            kxx kxxVar = kydVarC.k;
            if (kxxVar != null) {
                intents.setLocusId(kxxVar.b);
            }
            intents.setLongLived(kydVarC.l);
        } else {
            if (kydVarC.n == null) {
                kydVarC.n = new PersistableBundle();
            }
            kxa[] kxaVarArr2 = kydVarC.i;
            if (kxaVarArr2 != null && (length = kxaVarArr2.length) > 0) {
                kydVarC.n.putInt("extraPersonCount", length);
                int i3 = 0;
                while (i3 < kydVarC.i.length) {
                    PersistableBundle persistableBundle2 = kydVarC.n;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i4 = i3 + 1;
                    sb.append(i4);
                    String string = sb.toString();
                    kxa kxaVar = kydVarC.i[i3];
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = kxaVar.a;
                    persistableBundle3.putString("name", charSequence != null ? charSequence.toString() : null);
                    persistableBundle3.putString(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, kxaVar.c);
                    persistableBundle3.putString("key", kxaVar.d);
                    persistableBundle3.putBoolean("isBot", kxaVar.e);
                    persistableBundle3.putBoolean("isImportant", kxaVar.f);
                    persistableBundle2.putPersistableBundle(string, persistableBundle3);
                    i3 = i4;
                }
            }
            kxx kxxVar2 = kydVarC.k;
            if (kxxVar2 != null) {
                kydVarC.n.putString("extraLocusId", kxxVar2.a);
            }
            kydVarC.n.putBoolean("extraLongLived", kydVarC.l);
            intents.setExtras(kydVarC.n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            intents.setExcludedFromSurfaces(0);
        }
        return intents.build();
    }

    public final Size l() throws Resources.NotFoundException {
        Context context = this.d;
        ShortcutManager shortcutManagerM578m = kyg$$ExternalSyntheticApiModelOutline0.m578m(context.getSystemService(kyg$$ExternalSyntheticApiModelOutline0.m()));
        int iconMaxWidth = shortcutManagerM578m.getIconMaxWidth();
        int iconMaxHeight = shortcutManagerM578m.getIconMaxHeight();
        if (iconMaxWidth <= 0 || iconMaxHeight <= 0) {
            iconMaxWidth = context.getResources().getDimensionPixelSize(true != craf.f(context) ? R.dimen.default_shortcut_icon_size : R.dimen.default_shortcut_icon_size_low_ram);
            iconMaxHeight = iconMaxWidth;
        }
        return new Size(iconMaxWidth, iconMaxHeight);
    }

    public final eiju m(final Context context, final ConversationId conversationId, final String str, final alqm alqmVar, String str2, akbl akblVar, int i, final String str3, final int i2, boolean z) {
        return c(str2, context, akblVar == akbl.b, i).h(new ejvr() { // from class: dame
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                damh damhVar = this.a;
                Context context2 = context;
                IconCompat iconCompat = (IconCompat) obj;
                String str4 = str3;
                String str5 = str;
                ConversationId conversationId2 = conversationId;
                int i3 = i2;
                alqm alqmVar2 = alqmVar;
                return damhVar.k(context2, conversationId2, damhVar.n(str5, alqmVar2), alqmVar2, iconCompat, str4, i3);
            }
        }, this.h);
    }

    public final String n(String str, alqm alqmVar) {
        if (TextUtils.isEmpty(str)) {
            str = alqmVar != null ? alqmVar.o() : null;
        }
        return ((cssf) this.m.b()).d(ejwk.b(str));
    }

    @Deprecated
    public final String o(String str, String str2) {
        if (str == null) {
            str = str2;
        }
        return TextUtils.isEmpty(str) ? this.d.getResources().getString(R.string.unknown_sender) : str;
    }

    @Deprecated
    public final String p(String str, String str2) {
        String strO = o(str, str2);
        try {
            return Base64.encodeToString(MessageDigest.getInstance("MD5").digest(strO.getBytes()), 3);
        } catch (NoSuchAlgorithmException e) {
            a.o("Can't get MD5.", e);
            return strO;
        }
    }
}
