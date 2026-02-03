package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysItemView;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxau extends BaseAdapter implements cxay {
    public ekgb a;
    public final cqpz b;
    public final Map c;
    public final eotm d;
    public final Consumer e;
    private final LayoutInflater f;

    public cxau(cqpz cqpzVar, eotm eotmVar, Consumer consumer, Context context) {
        this.f = LayoutInflater.from(context);
        this.a = DebugGServiceKeysFragment.a(eotmVar);
        this.b = cqpzVar;
        this.d = eotmVar;
        this.e = consumer;
        this.c = cqpzVar.f();
    }

    @Override // defpackage.cxay
    public final void a(final String str, final String str2, final String str3) {
        DebugGServiceKeysFragment.b(str).ifPresentOrElse(new Consumer() { // from class: cxaq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                String str4 = str3;
                cxau cxauVar = this.a;
                eotm eotmVar = cxauVar.d;
                String str5 = (String) obj;
                boolean z = Boolean.parseBoolean(str4);
                eotmVar.c(str5, z == eotmVar.d(str5) ? Optional.empty() : Optional.of(Boolean.valueOf(z)));
                cxauVar.e.z(eotmVar.a());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: cxar
            @Override // java.lang.Runnable
            public final void run() {
                String str4 = str;
                String str5 = str2;
                Bundle bundle = cqqf.c;
                String str6 = str3;
                if (bundle == null) {
                    cqqf.c = new Bundle();
                }
                try {
                    if ("int".equals(str5)) {
                        cqqf.c.putInt(str4, Integer.parseInt(str6));
                        return;
                    }
                    if (ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG.equals(str5)) {
                        cqqf.c.putLong(str4, Long.parseLong(str6));
                        return;
                    }
                    if ("float".equals(str5)) {
                        cqqf.c.putFloat(str4, Float.parseFloat(str6));
                        return;
                    }
                    if ("bool".equals(str5)) {
                        cqqf.c.putBoolean(str4, Boolean.parseBoolean(str6));
                    } else {
                        if ("string".equals(str5)) {
                            cqqf.c.putString(str4, str6);
                            return;
                        }
                        throw new IllegalStateException("Invalid key type " + str5 + ", possibly calling parameters in wrong order?");
                    }
                } catch (NumberFormatException e) {
                    throw new IllegalStateException("GService keys values: invalid " + str4 + "," + str6 + "," + str5, e);
                }
            }
        });
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        final DebugGServiceKeysItemView debugGServiceKeysItemView = view instanceof DebugGServiceKeysItemView ? (DebugGServiceKeysItemView) view : (DebugGServiceKeysItemView) this.f.inflate(R.layout.debug_gservicekeys_item_view, viewGroup, false);
        final String str = (String) this.a.get(i);
        DebugGServiceKeysFragment.b(str).ifPresentOrElse(new Consumer() { // from class: cxas
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cxau cxauVar = this.a;
                eotm eotmVar = cxauVar.d;
                String str2 = (String) obj;
                boolean zD = eotmVar.d(str2);
                boolean zBooleanValue = ((Boolean) eotmVar.b(str2).orElse(Boolean.valueOf(zD))).booleanValue();
                String strValueOf = String.valueOf(zBooleanValue);
                boolean z = zBooleanValue != zD;
                debugGServiceKeysItemView.a(str, "bool", strValueOf, z, cxauVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: cxat
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 380
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cxat.run():void");
            }
        });
        return debugGServiceKeysItemView;
    }
}
