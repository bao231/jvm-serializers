/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package serializers.thrift.media;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

public class MediaContent implements TBase<MediaContent._Fields>, java.io.Serializable, Cloneable, Comparable<MediaContent> {
  private static final TStruct STRUCT_DESC = new TStruct("MediaContent");

  private static final TField IMAGE_FIELD_DESC = new TField("image", TType.LIST, (short)1);
  private static final TField MEDIA_FIELD_DESC = new TField("media", TType.STRUCT, (short)2);

  private List<Image> image;
  private Media media;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    IMAGE((short)1, "image"),
    MEDIA((short)2, "media");

    private static final Map<Integer, _Fields> byId = new HashMap<Integer, _Fields>();
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byId.put((int)field._thriftId, field);
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      return byId.get(fieldId);
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new EnumMap<_Fields, FieldMetaData>(_Fields.class) {{
    put(_Fields.IMAGE, new FieldMetaData("image", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, Image.class))));
    put(_Fields.MEDIA, new FieldMetaData("media", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, Media.class)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(MediaContent.class, metaDataMap);
  }

  public MediaContent() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MediaContent(MediaContent other) {
    if (other.isSetImage()) {
      List<Image> __this__image = new ArrayList<Image>();
      for (Image other_element : other.image) {
        __this__image.add(new Image(other_element));
      }
      this.image = __this__image;
    }
    if (other.isSetMedia()) {
      this.media = new Media(other.media);
    }
  }

  public MediaContent deepCopy() {
    return new MediaContent(this);
  }

  @Deprecated
  public MediaContent clone() {
    return new MediaContent(this);
  }

  public int getImageSize() {
    return (this.image == null) ? 0 : this.image.size();
  }

  public java.util.Iterator<Image> getImageIterator() {
    return (this.image == null) ? null : this.image.iterator();
  }

  public void addToImage(Image elem) {
    if (this.image == null) {
      this.image = new ArrayList<Image>();
    }
    this.image.add(elem);
  }

  public List<Image> getImage() {
    return this.image;
  }

  public MediaContent setImage(List<Image> image) {
    this.image = image;
    return this;
  }

  public void unsetImage() {
    this.image = null;
  }

  /** Returns true if field image is set (has been asigned a value) and false otherwise */
  public boolean isSetImage() {
    return this.image != null;
  }

  public void setImageIsSet(boolean value) {
    if (!value) {
      this.image = null;
    }
  }

  public Media getMedia() {
    return this.media;
  }

  public MediaContent setMedia(Media media) {
    this.media = media;
    return this;
  }

  public void unsetMedia() {
    this.media = null;
  }

  /** Returns true if field media is set (has been asigned a value) and false otherwise */
  public boolean isSetMedia() {
    return this.media != null;
  }

  public void setMediaIsSet(boolean value) {
    if (!value) {
      this.media = null;
    }
  }

  @SuppressWarnings("unchecked")
public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IMAGE:
      if (value == null) {
        unsetImage();
      } else {
        setImage((List<Image>)value);
      }
      break;

    case MEDIA:
      if (value == null) {
        unsetMedia();
      } else {
        setMedia((Media)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IMAGE:
      return getImage();

    case MEDIA:
      return getMedia();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case IMAGE:
      return isSetImage();
    case MEDIA:
      return isSetMedia();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MediaContent)
      return this.equals((MediaContent)that);
    return false;
  }

  public boolean equals(MediaContent that) {
    if (that == null)
      return false;

    boolean this_present_image = true && this.isSetImage();
    boolean that_present_image = true && that.isSetImage();
    if (this_present_image || that_present_image) {
      if (!(this_present_image && that_present_image))
        return false;
      if (!this.image.equals(that.image))
        return false;
    }

    boolean this_present_media = true && this.isSetMedia();
    boolean that_present_media = true && that.isSetMedia();
    if (this_present_media || that_present_media) {
      if (!(this_present_media && that_present_media))
        return false;
      if (!this.media.equals(that.media))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_image = true && (isSetImage());
    builder.append(present_image);
    if (present_image)
      builder.append(image);

    boolean present_media = true && (isSetMedia());
    builder.append(present_media);
    if (present_media)
      builder.append(media);

    return builder.toHashCode();
  }

  public int compareTo(MediaContent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MediaContent typedOther = (MediaContent)other;

    lastComparison = Boolean.valueOf(isSetImage()).compareTo(isSetImage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(image, typedOther.image);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetMedia()).compareTo(isSetMedia());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(media, typedOther.media);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      _Fields fieldId = _Fields.findByThriftId(field.id);
      if (fieldId == null) {
        TProtocolUtil.skip(iprot, field.type);
      } else {
        switch (fieldId) {
          case IMAGE:
            if (field.type == TType.LIST) {
              {
                TList _list4 = iprot.readListBegin();
                this.image = new ArrayList<Image>(_list4.size);
                for (int _i5 = 0; _i5 < _list4.size; ++_i5)
                {
                  Image _elem6;
                  _elem6 = new Image();
                  _elem6.read(iprot);
                  this.image.add(_elem6);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case MEDIA:
            if (field.type == TType.STRUCT) {
              this.media = new Media();
              this.media.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
        }
        iprot.readFieldEnd();
      }
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.image != null) {
      if (isSetImage()) {
        oprot.writeFieldBegin(IMAGE_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.image.size()));
          for (Image _iter7 : this.image)
          {
            _iter7.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.media != null) {
      if (isSetMedia()) {
        oprot.writeFieldBegin(MEDIA_FIELD_DESC);
        this.media.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MediaContent(");
    boolean first = true;

    if (isSetImage()) {
      sb.append("image:");
      if (this.image == null) {
        sb.append("null");
      } else {
        sb.append(this.image);
      }
      first = false;
    }
    if (isSetMedia()) {
      if (!first) sb.append(", ");
      sb.append("media:");
      if (this.media == null) {
        sb.append("null");
      } else {
        sb.append(this.media);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
