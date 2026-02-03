package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dhiz {
    UNKNOWN("unknown"),
    FILE("file"),
    GENERIC(""),
    IMSI("imsi"),
    IP_ADDRESS("ip_address", new Function() { // from class: dhiq
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo536andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Optional optionalOf;
            dhiz dhizVar = dhiz.UNKNOWN;
            boolean z = obj instanceof InetSocketAddress;
            Object address = z ? ((InetSocketAddress) obj).getAddress() : obj;
            if (address instanceof Inet4Address) {
                optionalOf = Optional.of("ipv4");
            } else {
                optionalOf = Optional.of(true != (address instanceof Inet6Address) ? "unknown" : "ipv6");
            }
            return ekgp.m("ip_version", optionalOf, "port", !z ? Optional.empty() : Optional.of(String.valueOf(((InetSocketAddress) obj).getPort())));
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }),
    LOCATION("loc_country"),
    MESSAGE_CONTENT("message_content"),
    MSRP_MESSAGE("msrp_message"),
    PHONE_NUMBER("phone_number", new Function() { // from class: dhir
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo536andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ekgp.l("last2", dhiz.a(obj, 2));
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }),
    SIM_GID("sim_gid"),
    SIM_ID("sim_id", new Function() { // from class: dhis
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo536andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ekgp.l("last3", dhiz.a(obj, 3));
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }),
    SIM_OPERATOR("sim_operator"),
    SIP_MESSAGE("sip_message"),
    URI(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, new Function() { // from class: dhit
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo536andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            dhiz dhizVar = dhiz.UNKNOWN;
            String strValueOf = String.valueOf(obj);
            int iIndexOf = strValueOf.indexOf(":");
            return ekgp.m("scheme", (iIndexOf <= 0 || iIndexOf >= strValueOf.length()) ? Optional.empty() : Optional.of(strValueOf.substring(0, iIndexOf)), "last2", dhiz.a(obj, 2));
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }),
    URI_SIP("uri_sip"),
    URI_TEL("uri_tel", new Function() { // from class: dhiu
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo536andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ekgp.l("last2", dhiz.a(obj, 2));
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }),
    USER_ID("user_id"),
    USER_ID_BOT("user_id_bot"),
    SIM_ICCID("sim_iccid"),
    SUBSCRIPTION_ID("subscription_id");

    private final String v;
    private final Function w;

    dhiz(String str) {
        this(str, new Function() { // from class: dhiy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dhiz dhizVar = dhiz.UNKNOWN;
                return ekoj.a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public static Optional a(Object obj, int i) {
        String strValueOf = String.valueOf(obj);
        return strValueOf.length() <= i ? Optional.of(strValueOf) : Optional.of(strValueOf.substring(strValueOf.length() - i));
    }

    public final String b(Collection collection) {
        return (String) Collection.EL.stream(collection).map(new Function() { // from class: dhiv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.c(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(","));
    }

    public final String c(Object obj) {
        String str = dhja.a;
        boolean zBooleanValue = ((Boolean) dfbu.g.a()).booleanValue();
        String strValueOf = String.valueOf(obj);
        if (!zBooleanValue && obj != null) {
            strValueOf = "chars:" + strValueOf.length();
            String str2 = (String) Collection.EL.stream(((ekgp) this.w.apply(obj)).entrySet()).filter(new Predicate() { // from class: dhiw
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    dhiz dhizVar = dhiz.UNKNOWN;
                    return ((Optional) ((Map.Entry) obj2).getValue()).isPresent();
                }
            }).map(new Function() { // from class: dhix
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    Map.Entry entry = (Map.Entry) obj2;
                    dhiz dhizVar = dhiz.UNKNOWN;
                    return String.format("%s:%s", entry.getKey(), ((Optional) entry.getValue()).get());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(","));
            if (!str2.isEmpty()) {
                strValueOf = a.q(str2, strValueOf, ",");
            }
        }
        return String.format("%s-pii:%s[%s]", true != zBooleanValue ? "redacted" : "raw", this.v, strValueOf);
    }

    dhiz(String str, Function function) {
        this.v = str;
        this.w = function;
    }
}
