package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuzu {
    public final cvar a;
    public final cuzd b;
    public final aijh c;
    public final crej d;
    public Optional e;
    public final Optional f;

    public cuzu(cuzd cuzdVar, aijh aijhVar, crej crejVar, Optional optional, fcsu fcsuVar) {
        this.b = cuzdVar;
        this.c = aijhVar;
        this.d = crejVar;
        this.f = optional;
        this.a = crbf.d() ? ((cvas) fcsuVar.b()).a(cuzdVar) : null;
    }

    public static SmartSuggestionData b(String str) {
        ezgh ezghVar = (ezgh) ezgi.a.createBuilder();
        ezgj ezgjVar = (ezgj) ezgk.a.createBuilder();
        ezgjVar.copyOnWrite();
        ezgk ezgkVar = (ezgk) ezgjVar.instance;
        str.getClass();
        ezgkVar.c = str;
        ezghVar.copyOnWrite();
        ezgi ezgiVar = (ezgi) ezghVar.instance;
        ezgk ezgkVar2 = (ezgk) ezgjVar.build();
        ezgkVar2.getClass();
        ezgiVar.d = ezgkVar2;
        ezgiVar.c = 2;
        ezgf ezgfVar = (ezgf) ezgg.b.createBuilder();
        ezan ezanVar = ezan.FULL_MESSAGE;
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).l = ezanVar.a();
        ezghVar.copyOnWrite();
        ezgi ezgiVar2 = (ezgi) ezghVar.instance;
        ezgg ezggVar = (ezgg) ezgfVar.build();
        ezggVar.getClass();
        ezgiVar2.e = ezggVar;
        ezgiVar2.b |= 1;
        return new SmartSuggestionItemSuggestionData((ezgi) ezghVar.build());
    }

    public final Drawable a(int i) {
        cuzd cuzdVar = this.b;
        return cqsu.h(cuzdVar.z(), i, eehg.d(cuzdVar.z(), R.attr.colorOnSurface, "SmartsSettingsFragmentPeer: failed to get color R.attr.colorOnSurfaceVariant"));
    }

    public final Optional c(int i) {
        cuzd cuzdVar = this.b;
        return Optional.ofNullable(cuzdVar.a(cuzdVar.Y(i)));
    }
}
