package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahpc extends ahpm {
    private final cssf r;
    private final avmp s;
    private final Optional t;
    private final ekgb u;

    public ahpc(Context context, cgaz cgazVar, cqzr cqzrVar, crac cracVar, crab crabVar, fcsu fcsuVar, cssf cssfVar, Optional optional, Optional optional2, Optional optional3, avmp avmpVar, cgbn cgbnVar, List list, cuhf cuhfVar, List list2) {
        super(context, cqzrVar, cgbnVar, cracVar, crabVar, fcsuVar, optional, optional2, list, cgazVar, cuhfVar, "Multiple Reminders Triggered");
        this.r = cssfVar;
        this.s = avmpVar;
        this.t = optional3;
        this.u = ekgb.n(list2);
    }

    @Override // defpackage.cgan, defpackage.cgbf
    public final String d() {
        return (String) this.t.map(new Function() { // from class: ahpb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return czwe.a(this.a.b, null);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahpm
    protected final List e() throws Resources.NotFoundException {
        ArrayList arrayList = new ArrayList();
        ekgb ekgbVar = this.u;
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            ahpm ahpmVar = (ahpm) ekgbVar.get(i);
            String str = ahpmVar.o;
            if (str != null) {
                ahpmVar.l();
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // defpackage.ahpm
    protected final void g() {
        avmp avmpVar = this.s;
        this.l.g = avmpVar.c(this.b);
    }

    @Override // defpackage.ahpm
    protected final void h() {
        kvq kvqVar = this.l;
        kvqVar.l();
        kvqVar.u = "reminder_notification_group_key";
        kvqVar.v = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahpm
    protected final void i() throws Resources.NotFoundException {
        Iterator it;
        kvy kvyVar = new kvy(this.l);
        Context context = this.b;
        String string = context.getString(R.string.enumeration_comma);
        ArrayList arrayList = new ArrayList();
        List list = this.k;
        Iterator it2 = list.iterator();
        long jMax = 0;
        while (it2.hasNext()) {
            ahpl ahplVar = (ahpl) it2.next();
            jMax = Math.max(ahplVar.a(), jMax);
            String strD = this.r.d(ahplVar.f());
            String string2 = context.getResources().getString(R.string.reminder_notification_title_prefix, strD);
            crac cracVar = this.d;
            String strG = ahplVar.g();
            String strC = ahplVar.c();
            Context context2 = cracVar.a;
            Context context3 = context;
            TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(context2, R.style.NotificationSenderText);
            List list2 = list;
            TextAppearanceSpan textAppearanceSpan2 = new TextAppearanceSpan(context2, R.style.NotificationTertiaryText);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (TextUtils.isEmpty(string2)) {
                it = it2;
            } else {
                spannableStringBuilder.append((CharSequence) string2);
                it = it2;
                spannableStringBuilder.setSpan(textAppearanceSpan, 0, string2.length(), 0);
            }
            String string3 = context2.getString(R.string.notification_separator);
            if (!TextUtils.isEmpty(strG)) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) string3);
                }
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) strG);
                spannableStringBuilder.setSpan(textAppearanceSpan2, length, strG.length() + length, 0);
            }
            if (!TextUtils.isEmpty(strC) && !le.w(strC)) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) string3);
                }
                spannableStringBuilder.append(cracVar.b(null, strC));
            }
            kvyVar.g(spannableStringBuilder);
            if (strD != null) {
                arrayList.add(strD);
            }
            context = context3;
            list = list2;
            it2 = it;
        }
        List list3 = list;
        this.m = context.getResources().getQuantityString(R.plurals.notification_new_reminders, list3.size(), Integer.valueOf(list3.size()));
        this.n = TextUtils.join(string, arrayList);
        kvq kvqVar = this.l;
        kvqVar.i(this.m);
        kvqVar.h(this.n);
        kvqVar.y(jMax);
        kvq kvqVar2 = this.l;
        crac cracVar2 = this.d;
        ekgb ekgbVar = this.u;
        kvqVar2.w(cracVar2.a(((ahpm) ekgbVar.get(0)).m, ((ahpm) ekgbVar.get(0)).n, null));
    }

    @Override // defpackage.ahpm
    protected final boolean j() {
        return false;
    }

    @Override // defpackage.ahpm
    protected final void f() {
    }
}
