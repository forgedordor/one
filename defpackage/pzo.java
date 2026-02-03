package defpackage;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzo {
    public static final byte[] a(pzs pzsVar) {
        int i;
        pzsVar.getClass();
        int i2 = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                int i3 = 1;
                dataOutputStream.writeShort(1);
                Map map = pzsVar.b;
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        dataOutputStream.writeByte(i2);
                    } else if (value instanceof Boolean) {
                        dataOutputStream.writeByte(i3);
                        dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                    } else if (value instanceof Byte) {
                        dataOutputStream.writeByte(2);
                        dataOutputStream.writeByte(((Number) value).byteValue());
                    } else if (value instanceof Integer) {
                        dataOutputStream.writeByte(3);
                        dataOutputStream.writeInt(((Number) value).intValue());
                    } else if (value instanceof Long) {
                        dataOutputStream.writeByte(4);
                        dataOutputStream.writeLong(((Number) value).longValue());
                    } else if (value instanceof Float) {
                        dataOutputStream.writeByte(5);
                        dataOutputStream.writeFloat(((Number) value).floatValue());
                    } else if (value instanceof Double) {
                        dataOutputStream.writeByte(6);
                        dataOutputStream.writeDouble(((Number) value).doubleValue());
                    } else if (value instanceof String) {
                        dataOutputStream.writeByte(7);
                        dataOutputStream.writeUTF((String) value);
                    } else {
                        if (!(value instanceof Object[])) {
                            Class<?> cls = value.getClass();
                            int i4 = fdcj.a;
                            throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new fdbi(cls).c())));
                        }
                        Object[] objArr = (Object[]) value;
                        Class<?> cls2 = objArr.getClass();
                        int i5 = fdcj.a;
                        fdbi fdbiVar = new fdbi(cls2);
                        int i6 = 11;
                        int i7 = 10;
                        int i8 = 8;
                        if (fdbq.f(fdbiVar, new fdbi(Boolean[].class))) {
                            i = 8;
                        } else if (fdbq.f(fdbiVar, new fdbi(Byte[].class))) {
                            i = 9;
                        } else if (fdbq.f(fdbiVar, new fdbi(Integer[].class))) {
                            i = 10;
                        } else if (fdbq.f(fdbiVar, new fdbi(Long[].class))) {
                            i = 11;
                        } else if (fdbq.f(fdbiVar, new fdbi(Float[].class))) {
                            i = 12;
                        } else if (fdbq.f(fdbiVar, new fdbi(Double[].class))) {
                            i = 13;
                        } else {
                            if (!fdbq.f(fdbiVar, new fdbi(String[].class))) {
                                throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new fdbi(objArr.getClass()).b())));
                            }
                            i = 14;
                        }
                        dataOutputStream.writeByte(i);
                        int length = objArr.length;
                        dataOutputStream.writeInt(length);
                        int i9 = 0;
                        while (i9 < length) {
                            Object obj = objArr[i9];
                            if (i == i8) {
                                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                                dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                            } else if (i == 9) {
                                Byte b = obj instanceof Byte ? (Byte) obj : null;
                                dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                            } else if (i == i7) {
                                Integer num = obj instanceof Integer ? (Integer) obj : null;
                                dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                            } else if (i == i6) {
                                Long l = obj instanceof Long ? (Long) obj : null;
                                dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                            } else if (i == 12) {
                                Float f = obj instanceof Float ? (Float) obj : null;
                                dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                            } else if (i == 13) {
                                Double d = obj instanceof Double ? (Double) obj : null;
                                dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                            } else {
                                String str2 = obj instanceof String ? (String) obj : null;
                                if (str2 == null) {
                                    str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                                }
                                dataOutputStream.writeUTF(str2);
                            }
                            i9++;
                            i8 = 8;
                            i6 = 11;
                            i7 = 10;
                        }
                    }
                    dataOutputStream.writeUTF(str);
                    i2 = 0;
                    i3 = 1;
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                fczl.a(dataOutputStream, null);
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            String str3 = pzt.a;
            qas.c();
            Log.e(str3, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }
}
