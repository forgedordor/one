package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbed implements alfa {
    private final String a;
    private final alfd b = alfd.f;
    private final Long c;
    private final String d;
    private final String e;

    public bbed(SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData, Long l, Context context) {
        this.a = smartSuggestionItemSuggestionData.a;
        this.c = l;
        ezgi ezgiVar = smartSuggestionItemSuggestionData.c;
        String str = (ezgiVar.c == 19 ? (ezbn) ezgiVar.d : ezbn.a).e;
        str.getClass();
        this.d = str;
        this.e = context.getString(R.string.calendar_suggestion_event_description);
    }

    @Override // defpackage.alff
    public final alfd a() {
        return this.b;
    }

    @Override // defpackage.alff
    public final String b() {
        return this.a;
    }

    @Override // defpackage.alfa
    public final Long c() {
        return null;
    }

    @Override // defpackage.alfa
    public final Long d() {
        return this.c;
    }

    @Override // defpackage.alfa
    public final String e() {
        return this.e;
    }

    @Override // defpackage.alfa
    public final String f() {
        return this.d;
    }

    @Override // defpackage.alfa
    public final String g() {
        return null;
    }
}
