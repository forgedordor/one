package androidx.appsearch.builtintypes;

import j$.time.Duration;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Event extends Thing {
    public final Instant a;
    public final Instant b;
    public final Duration c;
    public final String d;
    public final ImageObject e;

    protected Event(String str, String str2, int i, long j, long j2, String str3, List list, String str4, String str5, String str6, List list2, Instant instant, Instant instant2, Duration duration, String str7, ImageObject imageObject) {
        super(str, str2, i, j, j2, str3, list, str4, str5, str6, list2);
        this.a = instant;
        this.b = instant2;
        this.c = duration;
        this.d = str7;
        this.e = imageObject;
    }
}
